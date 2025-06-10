#include <assert.h>
#include <sel4/sel4.h>
#include <stdio.h>
#include <utils/util.h>

// cslot containing IPC endpoint capability  
extern seL4_CPtr endpoint;
// cslot containing a capability to the cnode of the server
extern seL4_CPtr cnode;
// empty cslot
extern seL4_CPtr free_slot;

int main(int c, char *argv[]) {
    seL4_Word sender;
    seL4_MessageInfo_t info = seL4_Recv(endpoint, &sender);
    
    while (1) {
        seL4_Error error;
        
        if (sender == 0) {
            /* No badge! give this sender a badged copy of the endpoint */
            seL4_Word badge = seL4_GetMR(0);
            error = seL4_CNode_Mint(cnode, free_slot, seL4_WordBits,
                                  cnode, endpoint, seL4_WordBits,
                                  seL4_AllRights, badge);
            printf("Badged %lu\n", badge);

            // Create info for sending the capability
            info = seL4_MessageInfo_new(0, 0, 1, 0);
            
            // Set the capability to be transferred
            seL4_SetCap(0, free_slot);
            
            // Reply to the client
            seL4_Reply(info);
            
            // Delete the transferred cap
            error = seL4_CNode_Delete(cnode, free_slot, seL4_WordBits);
            assert(error == seL4_NoError);
            
            // Wait for next message
            info = seL4_Recv(endpoint, &sender);
            
        } else {
            // Print received character
            printf("%c\n", (char)seL4_GetMR(0));

            // Reply to client and get next message
            info = seL4_MessageInfo_new(0, 0, 0, 1);
            seL4_Reply(info);
            info = seL4_Recv(endpoint, &sender);
        }
    }
    
    return 0;
}
