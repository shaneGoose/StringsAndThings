# Strings and Things
Shane Z. Guzman

This is a practice project. Problems are separated into branches. When you want to start a clean slate or switch problems run: `git reset --hard`. When you want to switch problems, run: `git checkout <branchName>`. The different problems "branchNames" is at the bottom of this page.

**Reference** [Java 8 String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html?is-external=true)

## Description

Suzy now needs to remove the placeholders and replace them with dummy strings. For now, the user will be "Jane" and the date will be "Wed Nov 30 22:10:10 EST 2022".

Use the **[replace](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#replace-java.lang.CharSequence-java.lang.CharSequence-)** method in the String library.

## Requirements

Two string message that is output to the user:
* Greeting message with date and time placeholder
* A goodbye string

The user should be set to a new variable and set to "Jane". The date will also be set to a new variable "Wed Nov 30 22:10:10 EST 2022".

## Expected Output/Behavior

OUTPUT: Hello, Jane! It is Wed Nov 30 22:10:10 EST 2022.

OUTPUT: Goodbye, Jane.

## Branches

| Ordinal | Branch Name | Description                      |
|---------|-------------|----------------------------------|
| 0       | string_0    | Simple String message output     |
| 1       | string_1    | Date placeholder and bye message |
| 2       | string_2    | Replace placeholders with dummy  |