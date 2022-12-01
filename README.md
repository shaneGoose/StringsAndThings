# Strings and Things
Shane Z. Guzman

This is a practice project. Problems are separated into branches. When you want to start a clean slate or switch problems run: `git reset --hard`. When you want to switch problems, run: `git checkout <branchName>`. The different problems "branchNames" is at the bottom of this page.

**Reference** [Java 8 String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html?is-external=true)

**Reference** [Java 8 Date](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html)

## Description

A String is an object and objects have methods. In the past few problems, you were accessing an objects methods, such as 'replace()', to modify or produce a new String. 

Jeremy has found a new Object called **Date**. In instantiating (or creating and new instance of this object), it will contain the current date and time it was created. Date also has a *toString()* method; this method will produce a human-readable String of the date and time. 

Use this new discovery to allocate the current date and time to the **date** variable. 

HINT: `new Date()` is needed to set the variable. The **new** keyword tells Java to construct a new instance from the Date object. 

## Requirements

Date string to be replaced with a Date Object.

## Expected Output/Behavior

OUTPUT: Hello, Jane! It is (current date and time).

OUTPUT: Goodbye, Jane.

## Branches

| Ordinal | Branch Name | Description                      |
|---------|-------------|----------------------------------|
| 0       | string_0    | Simple String message output     |
| 1       | string_1    | Date placeholder and bye message |
| 2       | string_2    | Replace placeholders with dummy  |
| 3       | string_3    | Format String                    |
| 4       | string_4    | Using Date Object                |