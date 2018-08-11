# ActivityLaunchMode

Android Activity Launch Mode
Launch mode is an instruction for Android OS which specifies how the activity should be launched. It instructs how any new activity should be associated with the current task. Before moving further you first need to understand about very important topics-

1. Tasks

2. Back Stack

Tasks
A task is a collection of activities that users interact with when performing a certain job. In general an application contains number of activities. Normally when user launch an application a new task will be created and the first activity instance is called root of the task.

When user launches an app from home icon, it navigates through different screens so different activities placed on the top of one another. This collection of activities is known as tasks.

Back Stack
Activities are arranged with the order in which each activity is opened. This maintained stack called Back Stack. When you start a new activity using startActivity(), it “pushes” a new activity onto your task, and put the previous Activity in the back stack.

Once you press back button then “pops” the top most activity and remove it from the back stack and taking you back to the previous activity.

A,B,C,D,E are Activities and there launch mode type are as following
* A and B Standard mode
* C SingleTop mode
* D SingleTask mode
* E SingleInstance mode
---------------------
### Standard
Start A

Task1 —  A

Start now B and C so

Task1 —  ABC

Start A and B now

Task1 —  ABCAB

### SingleTop
Start A

Task1 —  A

Start now B and C so

Task1 —  ABC

Start  C so

Task1 —  ABC

Start AB now

Task1 —  ABCAB

Start C

Task1 —  ABCABC

### SingleTask
Start A

Task1 — A

Start now B and C so

Task1 —  ABC

Start  C so

Task1 —  ABC

Start AB now

Task1 —  ABCAB

Start D

Task1 —  ABCABD

Start D

Task1 —  ABCABD

Start AB

Task1 — ABCABDAB

Start D

Task1 — ABCABD

Back press thrice

Task1 —  ABC

### SingleInstance
Start A

Task1 —  A

Start now B and C so

Task1 — ABC

Start  E so

Task1 —  ABC

Task2 —  E

Start  AB now

Task1 — ABCAB

Task2 — E

Start D and start E

Task1 — ABCABD

Task2 — E

Start E and D

Task1 —  ABCABD

Task2 —  E

Start AB

Task1 —  ABCABDAB

Task2 —  E

Start D

Task1 — ABCABD

Task2 — E

Back press thrice

Task1 — ABC

Task2 — E




