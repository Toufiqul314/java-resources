# Exploring the Collection Interface
- **Collection Interface**: Represents a generic collection of elements with methods to manipulate them.
- **Example Implementation**: `ArrayList` is commonly used to implement `Collection`.

## Methods That Handle Individual Elements
- `add(element)`: Adds an element, returns `true` if successful.
- `remove(element)`: Removes an element, returns `true` if successful.
- `contains(element)`: Checks if an element exists in the collection.

## Methods That Handle Other Collections
- `containsAll(Collection)`: Checks if all elements of another collection exist in this collection.
- `addAll(Collection)`: Adds all elements of another collection.
- `removeAll(Collection)`: Removes all elements that exist in another collection.
- `retainAll(Collection)`: Retains only elements that exist in another collection.

## Methods That Handle the Collection Itself
- `size()`: Returns the number of elements.
- `isEmpty()`: Checks if the collection is empty.
- `clear()`: Removes all elements.

## Getting an Array of the Elements of a Collection
- `toArray()`: Converts collection elements into an array.
- `toArray(T[] array)`: Returns an array of the same type as the given array.
- `toArray(IntFunction<T[]>)`: Uses a function to create an array dynamically.

## Filtering Elements with a Predicate (Java 8+)
- `removeIf(Predicate)`: Removes elements that satisfy a condition, improving readability.

## Choosing an Implementation for Collection
- No direct implementation of `Collection` in Java.
- `ArrayList` is the default choice for most use cases.