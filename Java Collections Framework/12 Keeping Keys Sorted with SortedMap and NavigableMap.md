## 1. Overview of `SortedMap` and `NavigableMap`
- `SortedMap` and `NavigableMap` extend the `Map` interface.
- `NavigableMap` is an extension of `SortedMap`.
- Both are implemented by `TreeMap`, which uses a red-black tree.

## 2. Key Sorting & Comparison
- Keys are always sorted.
- Two ways to define key ordering:
  1. Implement `Comparable` in key class.
  2. Provide a `Comparator` when creating the `TreeMap`.

## 3. Methods Added by `SortedMap`
- `firstKey()`, `lastKey()`: Get the smallest and largest key.
- `headMap(toKey)`: Returns a `SortedMap` with keys `< toKey`.
- `tailMap(fromKey)`: Returns a `SortedMap` with keys `≥ fromKey`.
- `subMap(fromKey, toKey)`: Returns a `SortedMap` with keys in range `[fromKey, toKey)`.

## 4. Methods Added by `NavigableMap`
### Accessing Specific Keys or Entries:
- `firstKey()`, `firstEntry()`, `lastKey()`, `lastEntry()`: Retrieve the smallest or largest key/entry.
- `ceilingKey(key)`, `ceilingEntry(key)`: Smallest key/entry `≥ key`.
- `higherKey(key)`, `higherEntry(key)`: Smallest key/entry strictly `> key`.
- `floorKey(key)`, `floorEntry(key)`: Largest key/entry `≤ key`.
- `lowerKey(key)`, `lowerEntry(key)`: Largest key/entry strictly `< key`.

### Queue-like Features:
- `pollFirstEntry()`: Removes and returns the smallest entry.
- `pollLastEntry()`: Removes and returns the largest entry.

### Reversing Order:
- `descendingKeySet()`: Returns a `NavigableSet` with keys in descending order.
- `descendingMap()`: Returns a `NavigableMap` with reversed order.

### Getting Submap Views:
- `subMap(fromKey, fromInclusive, toKey, toInclusive)`: Returns a customizable submap.
- `headMap(toKey, inclusive)`: Retrieves head portion of the map.
- `tailMap(fromKey, inclusive)`: Retrieves tail portion of the map.

## 5. View Behavior
- Submaps (`headMap`, `tailMap`, `subMap`) are backed by the original map.
- Changes to the main map reflect in the views and vice versa.
- **Restriction**: Cannot insert keys outside the defined submap range.
