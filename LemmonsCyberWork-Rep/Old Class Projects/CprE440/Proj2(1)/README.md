seL4 IPC Code

- `server.c`: Main server implementation handling badge distribution and message echoing
- `client_1.c`: First client implementation 
- `client_2.c`: Second client implementation 
- `CMakeLists.txt`: Build configuration file

Current Status

- Badge transfer working successfully
- Basic character reception and printing implemented
- Experiencing capability faults during client-server message exchange

Building and Running

1. Initialize the project:
```bash
./init --tut ipc
```

2. Build the project:
```bash
cd ipc_build
ninja
```

3. Run in QEMU:
```bash
./simulate
```

Known Issues

- Capability faults occur during message exchange phase
- Full message strings not printing properly
- Client alternation not fully implemented