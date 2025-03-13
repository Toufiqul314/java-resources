
Finding Your Way in the Queue Hierarchy
Java SE 5 saw the addition of a new interface in the Collections Framework: the Queue interface, further extended in Java SE 6 by the Deque interface. The Queue interface is an extension of the Collection interface.
The Queue Interface Hierarchy
The Queue Interface Hierarchy

###Pushing, Popping and Peeking
- **Stack (LIFO - Last In, First Out)**
- **Queue (FIFO - First In, First Out)**
### Main Operations:
- `push(element)`: Adds an element to the stack or queue.
- `pop()`: Removes the **youngest** (last added) element from the stack.
- `poll()`: Removes the **oldest** (first added) element from the queue.
- `peek()`: Views the next element to be removed (from stack or queue) **without** removing it.
### Reasons for Their Success:
1. **Simplicity** – Easy to implement, even in early computing.
2. **Usefulness** – Widely used in algorithms, especially stacks.
3. 
 # Modeling Queues and Stacks

## Interfaces for Queues and Stacks
- The **Queue** interface models a queue.  
- The **Deque** (double-ended queue) interface allows operations on both ends, making it act as both a queue and a stack.  

## Operations on Deque
- You can **push, pop, poll, and peek** elements from both the head and tail.  

## Usage in Concurrent Programming
- Stacks and queues are widely used in concurrent programming.  
- Additional interfaces (**BlockingQueue, BlockingDeque, TransferQueue**) extend these, combining collections with concurrency handling.  

## Handling Corner Cases
- A queue may be **full** and unable to accept more elements.  
- A queue may be **empty**, preventing pop, poll, or peek operations.  

## Design Consideration
- The implementation must decide how to handle full or empty queue scenarios.
