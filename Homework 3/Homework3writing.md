PART 1

Name: Aqdas Khan
Programming Language: Java
IDE/Editor: Visual Studio Code

PART 2 

Question 1:
What does ADT stand for?

ADT stands for Abstract Data Type

Question 2:
In your own words, what is an Abstract Data Type?

An Abstract Data Type is essentially a way of describing how a specific data structure should/would behave. Not only that but it also talks about what operations the specific data structure should support without coding it manually and telling it step by step.

Question 3:
What is the difference between an ADT and its implementation?
Use the following idea in your explanation:
WHAT
versus:
HOW

The different between an ADT and its implementation is that, an ADT describes what a data structure should do, while the implementation describes how the data structure is coded into the program and used. For example, when using a stack, an ADT would say that the items should follow a last in and first out behavior while the implementation would use an array and such.

Question 4:
Can two programmers create different implementations of the same ADT? Explain your answer.

Yes, two programmers can create different implementations of the same ADT. This is because all an ADT does is describe what the specific data structure does and not how it can be used or built. This means that another programmer can use stack in an array while someone else uses stack with linked list. Its the same job just in different ways. 

Question 5:
If one programmer creates a Stack using an array and another creates a Stack using a linked list, are both still Stacks? Explain why.

Yes, both are still Stacks because they follow the stack rules and the operations and such. All that is different is the implementation. 

PART 8 

Question 6:
What does LIFO mean?

LIFO means, Last in, First out. In easier terms it means that the last item added to the stack would be the first item removed. 

Question 7:
Why did 55 get removed before 15?

55 got removed before 15 because 55 was the last value added and because its a stack, it follows last in first out, so the last item added would be the first item removed. 

Question 8:
If the Stack contains:
A
B
C
D
and D was added last, which item should pop() remove first?

pop() should remove D first since it was the last item added and since stack follows last in first out, D would be out first. 

Question 9
Give one real-world or software example where a Stack could be useful.
Examples discussed in class may include:
●Browser Back history
●Undo operations
●Function calls
Explain your example.

One real-world example where a stack would be useful is when your listening to songs and you want to hear that last song again so you hit the playback button on spotify or itunes and whatnot. This can be seen as a stack since, the last song played, would be the first one played if you were to go back, which follows the stack behavior. 

PART 14 

Question 10:
What does FIFO mean?

FIFO means, first in first out. This means the first item added is the first item removed.


Question 11
Why was 15 removed before 55?

15 was removed before 55 becuase 15 was added to the queue first. Since the queue follows first in, first out, it would follow this behavior meaning that 15 gets removed before 55.

Question 12
If customers enter a line in this order:
Alex
Maria
John
Sarah
who should leave the Queue first?

Alex should leave the queue first since, they were the first person there meaning that they should be the first person out. (FIFO)

Question 13
Give one real-world or software example where a Queue could be useful.
Possible examples:
●Printer jobs
●Customer-service requests
●Tasks waiting to be processed
●People waiting in line
Explain your answer.

One real-world example could be a food delivery app where the fast food or resturant place gets orders and the first orders that come in are the first orders that get done or out, while any other orders added go in the back. 

PART 15

Scenario 1 — Undo Feature
A text editor remembers your recent actions.
If you type:
A
B
C
the most recent action should be undone first.
Stack or Queue?
Explain.

This should be stack because since its saying that the most recent action should be undone, it would follow the behavior of last in, first out meaning that it would follow stack. 


Scenario 2 — Printer
Three students send documents to a printer.
The first document submitted should normally print first.
Stack or Queue?
Explain.

I would use queue because it says how the first document should be print first meaning that its first in first out behavior, which follows queue.

Scenario 3 — Browser Back Button
You visit:
Google
YouTube
GitHub
Amazon
You click the Back button.
Which page should appear first?
What ADT does this resemble?

The page that should appear first would be GitHub. This would resemble Stack because, the most recently visted page is returned to first which follows the stack behavior (LIFO).

Scenario 4 — Customer Service
Customers are waiting to talk to an employee.
The person who arrived first should normally be helped first.
Stack or Queue?

This would be queue since the customor who arrives first, gets help first (FIFO).

Scenario 5 — Plates
You place five plates on top of one another.
Which ADT does this represent?
Explain.

This resembles stack because when usually when taking out plates that are stacked on top of each other, the last plate put in, would be the first plate taken out (LIFO).

Stack
Start with an empty Stack.
push(7)
push(12)
push(18)
pop()
push(22)
peek()

PART 16

Question 14
What does pop() return?

I would predict that pop returns 18 because it was the last item added before pop was called. 

Question 15
What does the final peek() return?

The final peek() returns 22 because after 18 is removed, 22 is then added to the top of the stack.

Queue
Start with an empty Queue.
enqueue(7)
enqueue(12)
enqueue(18)
dequeue()
enqueue(22)
peek()

Question 16
What does dequeue() return?

dequeue() would return 7 becuase 7 was the first item added to the queue.

Question 17
What does the final peek() return?

The final peek() returns 12 because after 7 gets removed, 12 becomes the item at the front of the queue.

PART 17

| Feature | Stack | Queue |
|-----------|---------|-------|
| Rule | LIFO | FIFO |
| Add operation | push() | enqueue() |
| Remove operation | pop() | dequeue() |
| View next item | peek() | peek() |
| First item removed | The most recently added item | The first item added |

PART 18

Question 18
If you implement a Stack using an array, which part is the ADT?

The ADT is the stack itself and not the array as well as the behaviors it follows such as using push(), pop(), peek(), and isEmpty(), as well as the LIFO rule.

Question 19
Which part is the implementation?

The implementation is the actual code used to build the stack such as the array. 

Question 20
If you replace the array with a linked list but keep the same Stack operations, did the ADT change?
Explain.

The ADT did not change. The Stack still follows the same LIFO behavior as well as the same operations. The only thing that changed was the implementation. 

