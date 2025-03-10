
# Immutable and Synchronized Collections in Java

## 1. **Creating Immutable Collections (Java SE 9)**

In Java SE 9, the `List.of()` and `Set.of()` methods are used to create immutable collections.

### Example:
```java
List<String> stringList = List.of("one", "two", "three");
Set<String> stringSet = Set.of("one", "two", "three");
The stringList and stringSet are immutable.
You cannot add, remove, or modify elements in these collections.
Example of modification attempt:
stringList.add("four"); // Throws UnsupportedOperationException
No null values are allowed in these collections:
Set<String> nullSet = Set.of("one", "two", null); // Throws NullPointerException
No duplicates in sets:
Set<String> duplicateSet = Set.of("one", "one"); // Throws IllegalArgumentException
2. Creating Immutable Copies of Collections (Java SE 10)
List.copyOf() and Set.copyOf() create immutable copies of existing collections.

Example:
List<String> list = Arrays.asList("one", "two", "three");
List<String> copiedList = List.copyOf(list); // Creates an immutable copy of the list

Set<String> copiedSet = Set.copyOf(list); // Creates an immutable copy of the set
Null values and duplicates are not allowed:
List<String> nullList = List.copyOf(Arrays.asList("one", "two", null)); // Throws NullPointerException
Set<String> duplicateSet = Set.copyOf(Arrays.asList("one", "one")); // Keeps only one "one"
3. Wrapping an Array in a List
The Arrays.asList() method wraps an array in a list.

Example:
String[] array = {"one", "two", "three"};
List<String> list = Arrays.asList(array); // Wraps the array in a list
This list behaves like the array, meaning you can replace elements but cannot add or remove them:
list.set(1, "four"); // Replaces "two" with "four"
list.add("five"); // Throws UnsupportedOperationException
4. Using the Collections Factory Class
The Collections class provides several methods to manipulate collections.

Example: min() and max() methods
List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
int min = Collections.min(numbers); // Finds minimum element
int max = Collections.max(numbers); // Finds maximum element
Example: indexOfSublist() and lastIndexOfSublist()
List<String> source = Arrays.asList("apple", "banana", "cherry", "apple");
List<String> target = Arrays.asList("banana", "cherry");

int index = Collections.indexOfSublist(source, target); // Returns 1
int lastIndex = Collections.lastIndexOfSublist(source, target); // Returns 1
Example: Sorting and shuffling a list
List<String> list = Arrays.asList("one", "two", "three");
Collections.sort(list); // Sorts the list in place
Collections.shuffle(list); // Randomly shuffles the list
5. Wrapping a Collection in an Immutable Collection
You can create an immutable wrapper around an existing collection using methods like unmodifiableList().

Example:
List<String> originalList = new ArrayList<>(Arrays.asList("apple", "banana"));
List<String> immutableList = Collections.unmodifiableList(originalList);
Modifying the original list will reflect in the immutable wrapper:
originalList.add("cherry");
System.out.println(immutableList); // Outputs: [apple, banana, cherry]
Attempting to modify immutableList will throw an exception:
immutableList.add("date"); // Throws UnsupportedOperationException
6. Wrapping a Collection in a Synchronized Collection
The Collections.synchronizedList() method wraps a collection to ensure thread safety.

Example:
List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
List<String> synchronizedList = Collections.synchronizedList(list);
All operations on synchronizedList are synchronized to prevent race conditions.
However, you need to handle synchronization manually when using iterators or streams:
synchronized (synchronizedList) {
    Iterator<String> it = synchronizedList.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }
}
