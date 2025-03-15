## 1. Avoid Mutable Keys
Using mutable keys in maps (like `HashMap`) is an antipattern. Mutating keys after they've been added can lead to unexpected behavior and cause data loss or unreachable map entries.

## 2. Example of Mutable Key Issue
- A mutable `Key` class can be used in a `HashMap`. When the key is mutated after adding it to the map, the map can no longer correctly retrieve the value.
- Changing the key to a value that doesn’t exist in the map can result in lost entries.

## 3. Effect of Key Mutation
- If a key is changed to a new value after insertion, it can cause the map to return `null` for that key, even though the object itself hasn’t been removed.
- If the mutated key matches another key’s original value, it can return the wrong associated value.

## 4. Recommendation
To avoid issues, **use immutable keys**. If mutable keys must be used, avoid mutating them after insertion into a map or set.

## 5. HashSet and Mutable Keys
- A `HashSet` internally uses a `HashMap`. Mutating objects after adding them to a set can cause unexpected results, like having duplicate objects in the set or losing elements.
- Example: If a mutable `Key` is added to a set and mutated, it may cause the set to hold the same object twice.

## 6. Conclusion
To prevent difficult-to-debug issues, it's best not to mutate objects that are used as keys in collections like `Map` or `Set`. If mutation is unavoidable, ensure objects are not modified after being added.
