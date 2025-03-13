
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

  ### Modeling FIFO Queues with Queue
- **Queue Interface:** Provides two ways to handle corner cases—throwing an exception or returning a special value.
- **Key Queue Methods:**
  - `add(element)`: Throws `IllegalStateException` if full.
  - `offer(element)`: Returns `false` if full.
  - `remove()`: Throws `NoSuchElementException` if empty.
  - `poll()`: Returns `false` if empty.
  - `element()`: Throws `NoSuchElementException` if empty.
  - `peek()`: Returns `null` if empty.

### Modeling LIFO Stacks and FIFO Queues with Deque
- **Deque Interface (Java SE 6):** Extends `Queue` and introduces a new naming convention.
- **FIFO Methods in Deque:**
  - `addLast(element)`: Throws `IllegalStateException` if full.
  - `offerLast(element)`: Returns `false` if full.
  - `removeFirst()`: Throws `NoSuchElementException` if empty.
  - `pollFirst()`: Returns `null` if empty.
  - `getFirst()`: Throws `NoSuchElementException` if empty.
  - `peekFirst()`: Returns `null` if empty.
- **LIFO Methods in Deque:**
  - `addFirst(element)`: Throws `IllegalStateException` if full.
  - `offerFirst(element)`: Returns `false` if full.
  - `removeFirst() (pop)`: Throws `NoSuchElementException` if empty.
  - `pollFirst()`: Returns `null` if empty.
  - `getFirst()`: Throws `NoSuchElementException` if empty.
  - `peekFirst()`: Returns `null` if empty.

### Deque Naming Convention
- `getFirst()` and `getLast()` in Deque correspond to `element()` in Queue.
- **Additional Methods in Deque:**
  - `push(element)`: Adds element to the head.
  - `pop()`: Removes and returns the head element.
  - `poll()`: Removes and returns the tail element.
  - `peek()`: Shows the tail element (returns `null` if empty).

### Implementing Queue and Deque
- **Java Collections Framework Implementations:**
  1. **ArrayDeque**: Implements both Queue and Deque, backed by an array with dynamic resizing.
  2. **LinkedList**: Implements both Queue and Deque, backed by a linked list for efficient first/last element access.
  3. **PriorityQueue**: Implements only Queue, keeps elements sorted by natural order or a custom comparator.

### Avoiding the Stack Class
- **Stack is an extension of Vector, which is discouraged** due to outdated design.
- **Alternative:** Use `Deque` (e.g., `ArrayDeque`) instead.
- **For thread-safe stacks:** Consider `BlockingQueue` implementations.
