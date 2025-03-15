## Adding a Key-Value Pair to a Map
- `put(key, value)`: Adds a key-value pair to a map. If the key already exists, it replaces the value.  
- Returns the previous value associated with the key or `null` if it's a new key.  
- **Java 8 introduced `putIfAbsent(key, value)`**:
  - Adds the key-value pair only if the key is not present or has a `null` value.  
  - Useful for avoiding `NullPointerException` during auto-unboxing.  

## Getting a Value from a Key
- `get(key)`: Retrieves the value associated with a key.  
- **Java 8 introduced `getOrDefault(key, defaultValue)`**:
  - Returns the value if the key exists.  
  - Otherwise, returns the provided default value.  

## Removing a Key from a Map
- `remove(key)`: Removes a key-value pair and returns the value (or `null` if not found).  
- **Java 8 introduced `remove(key, value)`**:
  - Removes the key-value pair only if both the key and value match exactly.  
  - Returns `true` if removed successfully.  

## Checking for Key or Value Presence
- `containsKey(key)`: Checks if the map contains a specific key.  
- `containsValue(value)`: Checks if the map contains a specific value.  
