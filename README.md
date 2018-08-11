# ActivityLaunchMode
A and B Standard mode
C SingleTop
D SingleTask
E SingleInstance
---------------------
Standard
Start A
A
start now B and C so
ABC
start AB now
ABCAB

SingleTop
Start A
A
start now B and C so
ABC
start  C so
ABC
start AB now
ABCAB
start C
ABCABC

SingleTask
Start A
A
start now B and C so
ABC
start  C so
ABC
start AB now
ABCAB
start D
ABCABD
start D
ABCABD
Start AB
ABCABDAB
Start D
ABCABD
Back press thrice
ABC

SingleInstance
Start A
A
start now B and C so
ABC
start  E so
ABC
E
start AB now
ABCAB
E
start D
ABCABD
E
start D
ABCABD
E
Start AB
ABCABDAB
E
Start D
ABCABD
E
Back press thrice
ABC
E



