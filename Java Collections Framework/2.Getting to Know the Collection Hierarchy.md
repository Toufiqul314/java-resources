# Key Points: Java Collection Interface Hierarchy

## 1. Collection Interface Hierarchy
- The **Collections Framework** is structured into multiple interfaces and classes.
- The **Collection interface** is central to this hierarchy.

## 2. Iterable Interface
- **Iterable** is the root interface (introduced in Java SE 5) but **not part of the Collections Framework**.
- It enables iteration over objects using the **for-each loop**.
- Any **Collection** implements **Iterable**.
- To implement Iterable, an object must provide an **Iterator**.

## 3. Collection Interface
- Defines common operations for storing elements in containers.
- Supports fundamental operations:
  - **Add** or **remove** elements.
  - **Check** for element presence.
  - **Get size** or check if empty.
  - **Clear** elements.
- **Set operations** include:
  - **Union**, **Intersection**, **Complement**, **Subset check**.
- Elements can be accessed by:
  - **Iteration** (using Iterator).
  - **Streams** (for parallel operations).

## 4. List Interface (Extends Collection)
- **Maintains order**: Elements retain the order in which they were added.
- Elements have **indexes**, allowing:
  - **Access** elements by index.
  - **Insert**, **delete**, or **replace** at a specific index.
  - **Retrieve sublists** (range of elements).

## 5. Set Interface (Extends Collection)
- **No duplicate elements** allowed.
- Adding an element **may fail** if it already exists.
- **No indexing**, unlike Lists.

## 6. SortedSet and NavigableSet (Extensions of Set)
### SortedSet:
- **Maintains elements in ascending order**.
- Uses **Comparable** (`compareTo` method) or an external **Comparator** for sorting.
- Supports:
  - Finding **lowest and highest elements**.
  - Extracting **headSet** (less than a given element) and **tailSet** (greater than a given element).

### NavigableSet:
- Extends **SortedSet** with more methods.
- Allows **reverse iteration** (descending order).