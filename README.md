# Kotlin map() function doesn't modify the original list

This example demonstrates a common misunderstanding with the `map()` function in Kotlin. Many developers expect `map()` to modify the original list in place. However, `map()` in Kotlin (and many other functional programming languages) returns a *new* list containing the transformed elements, leaving the original list unchanged.  This is to promote immutability and prevent unintended side effects.

The provided code shows this behavior.  The `map()` function transforms elements, but the original mutable list is not affected. To modify the list in place, you need to use the `mapIndexedTo` method or other mutable list manipulation functions.
