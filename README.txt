CS542 Design Patterns
Spring 2016
ASSIGNMENT <ASSIGNMENT 2> README FILE

Due Date: <ASSIGNMENT DUE DATE,  Monday, February 29, 2016>
Submission Date: <DATE SUBMITED, Monday, February 29, 2016>
Author(s): <RISHI SANAS> 
e-mail(s): <rsanas1@binghamton.edu> 

FILES:-
Driver.java
Results.java
StdoutDisplayInterface.java
CreateWorkers.java
WorkerThread.java
FileProcessor.java
IsPrime.java
Logger.java

SAMPLE OUTPUT:-
(Debug value = 0)
***********
The sum of all the prime numbers is :66399
***********

(Debug value = 1)
[3, 1, 1, 11, 3, 1, 1, 11, 3, 1, 1, 11, 3, 1, 1, 11, 3, 1, 1, 11, 3, 1, 1, 11, 45, 65, 43, 23, 87, 67, 21, 463, 65433, 45, 11]
***********
The sum of all the prime numbers is :66399
***********

(Debug value = 2)
3 added to Result datastructure
1 added to Result datastructure
1 added to Result datastructure
11 added to Result datastructure
3 added to Result datastructure
1 added to Result datastructure
1 added to Result datastructure
11 added to Result datastructure
3 added to Result datastructure
1 added to Result datastructure
1 added to Result datastructure
11 added to Result datastructure
3 added to Result datastructure
1 added to Result datastructure
1 added to Result datastructure
11 added to Result datastructure
3 added to Result datastructure
1 added to Result datastructure
1 added to Result datastructure
11 added to Result datastructure
3 added to Result datastructure
1 added to Result datastructure
1 added to Result datastructure
11 added to Result datastructure
45 added to Result datastructure
65 added to Result datastructure
43 added to Result datastructure
23 added to Result datastructure
87 added to Result datastructure
67 added to Result datastructure
21 added to Result datastructure
463 added to Result datastructure
65433 added to Result datastructure
45 added to Result datastructure
11 added to Result datastructure
***********
The sum of all the prime numbers is :66399
***********

(Debug value = 3)
In run method
In run method
***********
The sum of all the prime numbers is :66399
***********


(Debug value = 4)
FileProcessor Constructor called
CreateWorkers Constructor called
WorkerThread Constructor called
WorkerThread Constructor called
***********
The sum of all the prime numbers is :66399
***********

TO CLEAN :-
ant -buildfile src/build.xml clean

TO COMPILE :- 
ant -buildfile src/build.xml all

TO RUN :- 
ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=3 -Darg2=2

DATA STRUCTURE USED:-
To store the sum of all prime numbers I have Used Vector,because we need dynamic storage.
Vector(int size, int incr)
This constructor creates a vector whose initial capacity is specified by size and whose increment is specified by incr. 
The increment specifies the number of elements to allocate each time that a vector is resized upward