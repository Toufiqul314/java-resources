
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
