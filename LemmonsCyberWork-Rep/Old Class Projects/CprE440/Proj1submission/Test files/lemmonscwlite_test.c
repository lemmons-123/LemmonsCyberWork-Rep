#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>
#include <errno.h>
#include "cwlite.h"

void test_file_access(const char* filename){
	int fd;
	char buffer[100];

	printf("Testing access to %s:\n", filename);

	fd = open(filename, O_RDONLY);
	if(fd < 0){
		printf("Open failed: %s\n", strerror(errno));
	}else {
		printf("Open success\n");

		ssize_t bytes_read = read(fd, buffer, sizeof(buffer -1);
		if(bytes_read < 0)[
			printf("read failed: %s\n", strerror(errno));
		}else {
			buffer[bytes_read] = '\0';
			printf("Read success: %s\n", buffer);
		}

		close(fd);

	}
	printf("\n");
}

int main(){
	int cwl_fd = cwlite_open();
	if(cwl_fd < 0) {
		printf("Failed to open interface\n");
		return 1;
	}

	printf("Test1: cwlite off\n");
	cwlite_off(cwl_fd);
	test_file_access("trusted.txt");
	test_file_access("untrusted.txt");
	test_file_access("no_attr.txt");

	cwlite_close(cwl_fd);
	return 0;
}


