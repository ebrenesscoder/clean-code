# Meaningful Names
- Change names when you find better ones.
- If a name requires a comment, then the name does not reveal its intent.
- Choose a name that specifies what is being measured and the unit. e.g. `elapsedTimeInDays`
- Always use constants to represent important numbers/booleans. 
``` java
// WRONG
if (elapsedTimeInDays < 4) {
    // code here
}

// CORRECT
if (elapsedTimeInDays < MAX_DAYS_TO_COMPLETE_ORDER) {
    // code here
}
```
- Avoid leaving false clues that obscure the meaning of code.e.g. Do not refer to a grouping of accounts as an `accountList`, if the data structure is actually a `Map` or any other than `List`. Just `accounts` would be better.
- spot the subtle difference between `XYZControllerForEfficientHandlingOfStrings` in one module and `XYZControllerForEfficientStorageOfStrings`. This can cause a developer to select the wrong class.
- 
