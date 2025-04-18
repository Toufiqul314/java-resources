
1. **Definition of Generics**
   - Generics allow types (classes and interfaces) to be parameters in class, interface, and method definitions.
   - Like method parameters, but the inputs are **types**, not values.

2. **Benefits of Using Generics**
   - **Stronger type checks at compile time**: 
     - Compile-time errors are easier to detect and fix compared to runtime errors.
   - **Elimination of explicit casting**: 
     - Generics remove the need for casting when retrieving elements from collections.
   - **Support for generic algorithms**: 
     - Enables creation of type-safe, reusable, and customizable algorithms that work with various data types.

3. **Code Example Without Generics**
   ```java
   List list = new ArrayList();
   list.add("hello");
   String s = (String) list.get(0);  // requires casting


   