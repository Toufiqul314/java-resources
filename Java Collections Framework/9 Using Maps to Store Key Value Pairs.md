## 1. Introduction to HashMap
- HashMap is a fundamental data structure used to store key-value pairs.
- The key acts as an identifier for a value, and values can be complex objects.
- Keys are unique, but values can be duplicated.

## 2. Map Interface Hierarchy
- The `Map` interface provides the structure for key-value storage.
- `SortedMap` maintains sorted keys, similar to `SortedSet`.
- `NavigableMap` extends `SortedMap` with additional navigation methods.

## 3. Implementations of Map
- `HashMap` is the most widely used implementation.
- `LinkedHashMap` maintains insertion order.
- `IdentityHashMap` compares keys using reference equality (`==`) instead of `equals()`.

## 4. Multimap Concept
- Java’s `Map` does not directly support multiple values for a single key.
- This can be implemented by storing lists as values.

## 5. Creating Maps Using Factory Methods (Java 9+)
- `Map.of(key, value, ...)` creates an immutable map (up to 10 entries).
- `Map.ofEntries(Map.entry(key, value), ...)` supports more than 10 entries.
- These maps are immutable and do not allow `null` keys or values.

## 6. Operations on a Map
- **Adding** (`put`) a key-value pair.
- **Retrieving** (`get`) a value using a key.
- **Removing** a key (and its value).
- **Checking** if the map is empty or getting its size.
- **Copying** content from another map.
- **Clearing** all entries.

## 7. Key Considerations for Using Maps
- Keys should not be mutable; modifying a key can break retrieval.
- `Map.Entry` models key-value pairs with:
  - `getKey()`
  - `getValue()`
  - `setValue()`
- Changing the key in `Map.Entry` is not allowed to maintain data integrity.
