# ActivityLaunchMode
* A and B Standard mode
* C SingleTop
* D SingleTask
* E SingleInstance
---------------------
### Standard
Start A
- A
Start now B and C so
- ABC
Start AB now
- ABCAB

### SingleTop
Start A
- A
Start now B and C so
- ABC
Start  C so
- ABC
Start AB now
- ABCAB
Start C
- ABCABC

### SingleTask
Start A
- A
Start now B and C so
- ABC
Start  C so
- ABC
Start AB now
- ABCAB
Start D
- ABCABD
Start D
- ABCABD
Start AB
- ABCABDAB
Start D
- ABCABD
Back press thrice
- ABC

### SingleInstance
Start A
- A
Start now B and C so
- ABC
Start  E so
- ABC
- E
Start AB now
- ABCAB
- E
Start D
- ABCABD
- E
Start D
- ABCABD
- E
Start AB
- ABCABDAB
- E
Start D
- ABCABD
- E
Back press thrice
- ABC
- E



