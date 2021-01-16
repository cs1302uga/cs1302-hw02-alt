# hw02 Censored (********)

![Approved for: Spring 2021](https://img.shields.io/badge/Approved%20for-Spring%202021-success)

This class exercise is designed to familiarize students with exceptions and file I/O in Java.

## Prerequisite Knowledge

* Basic knowledge of Java exceptions, including checked exceptions, unchecked exceptions, and
  the use of `try`-`catch`, `throw`, and `throws`.
* Familiarity with program command-line arguments in Java.

## Course-Specific Learning Outcomes

* **LO2.b:** Define, throw, and propagate exceptions appropriately in a software solution.

## Introduction

In this assignment, you will write a program called `Censor`. `Censor` is a modified version of the 
Unix `cat` command that censors lines that contain any word listed in the list of censored words.

The program prints the contents of either a specified file or standard input to standard output 
replacing each character of any censored line with an asterisk.
 
For example, if "Tech" is a censored word and is found in one of the input lines,
the program censors the original line replacing each character of the line with
an asterisk. So, if the line read "Go Tech!", the censored output would be
"********" since the full line contains eight characters.
   
Remember, the commands you have been executing in Unix are just programs that were installed 
by the system administrators. `Censor.java` works similarly to `cat` but will be written by you. 
Before compiling, use the Unix `cat` utility to print the contents of `Censor.java` and `Utility.java`
to the terminal. Write the command you used to do this in your notes.
   
### Introductory Video

The following video contains a brief introduction to the exercise and a demo: 

https://youtu.be/wCQhKbqQtbA

<a href="https://youtu.be/wCQhKbqQtbA">
<img src="http://i3.ytimg.com/vi/wCQhKbqQtbA/hqdefault.jpg" alt="IMAGE ALT TEXT">
</a>

### Censored Word File 

The first argument to the program must be the name of the censored word file located in the main 
project directory (`cs1302-hw02`). The censored word file should have the following format:

 * The first token is an integer indicating the
   number of censored words contained in the file.

 * Subsequent tokens are strings (separated by white space)
   indicating each censored word.
   
**NOTE:** Since we know tokens will be separated by white space, we can use the `next` method
of the `Scanner` class to read each censored word.

**NOTE:** It is acceptable for white-space to occur both at the beginning and 
end of the file.

The following censored word files are valid:

```
3
Tech
Yellow
Jackets
```

```
8 Tech Yellow  Jackets   Gators      Tigers   Tide    Volunteers             Gamecocks
```

```
8
         Tech      Yellow

Jackets   Gators Tigers Tide Volunteers             Gamecocks
```

Additional valid censored word files can be found in the folder that you cloned and here: 
   * [Censored.txt](Censored.txt)
   * [Censored2.txt](Censored2.txt)
   * [Censored3.txt](Censored3.txt)

You can assume that the censored word file is formatted correctly. In other words, it starts with an integer
and contains the proper number of words. 
However, **if a censored word file cannot be read because it cannot be found or cannot be read due to permission,** 
your program should print the following error message just before termination:

```
Censor: Censored word file FILENAME does not exist or cannot be read due to permission.

```

### Command-Line Arguments

The following command-line arguments are expected:
   1. **Required:** The name of the file containing the censored words.
      Note: The name of the censored word file must be the first argument.
   1. **Optional:** Where the program should read its input from. Can be either:
      * A single dash (-) indicating that the input should come from standard input.
      * The name of a file indicating that the input should come from a regular file.
        Note: The program should accept any number of optional inputs in any order.
        In other words, the program should allow multiple file names and dashes to be
        given in any order in a single execution.

Here are a few examples of ways you could execute the program:

Reads input from standard in:
```
java -cp bin cs1302.exceptions.Censor Censored.txt -
```

Reads input from `file1.txt`:
```
java -cp bin cs1302.exceptions.Censor Censored.txt file1.txt
```

Reads input from `file1.txt` and then standard in:

```
java -cp bin cs1302.exceptions.Censor Censored.txt file1.txt -
```

**if no censored word filename is given,** your program should print the following error message just before termination:

```
Censor: Censored word filename not provided. Should be the first command-line argument.

```

### Input Redirection

Your program must handle input redirection. So, we should be able to run your program using a command similar to the following:

```
java -cp bin cs1302.exceptions.Censor Censored.txt - < file1.txt
```

Note, in this command, you are reading from standard input. However, standard input has been redirected to `file1.txt`. So, the
program's output should be from `file1.txt`.

### Test Cases

The `cs1302-hw02` folder that you cloned contains three censored word files and an input file called `file1.txt`. You should create
additional test cases to make sure your code is working properly. For this assignment, feel free to share test cases that you create on the course
Piazza page.

### Checkpoint 1 Steps - Getting Started

1. Use Git to clone the repository for this exercise onto Odin into a subdirectory called `cs1302-hw02`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-hw02.git
   ```

1. Change into the `cs1302-hw02` directory that was just created and look around. There should be
   multiple Java files somewhere in the directory structure. You may want to execute the `find` command
   on the `src` directory for a quick, easy-to-read view of the directory contents.

   * What are the fully qualified names for the classes contained in the Java files?
   * What is the path to the default package for _source code_ relative to the `cs1302-hw02`
     directory?

1. Read through the Java code and comments in `Censor.java` and `Utility.java`. Note, there will be a dependency 
   between the two files (one will use the other). Once the files are completed, which `.java` file will need 
   to be compiled first?

1. From the `cs1302-hw02` directory, try to compile each Java file separately, specifying `bin`
   as the default package for _compiled code_. 

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-1-success?style=for-the-badge)

<hr/>

### Checkpoint 2 Steps - `Utility.java`

1. Implement the methods in the Utility class. Should we tell them where to start? Should we tell them to test the methods in main?
1. We could walk them through each method and have them test each one individually.



<!--
1. From the `cs1302-hw02` directory, use your freshly compiled `Censor` program to display the contents of
   `Utility.java` by passing the relative path to `Utility.java` as a command-line argument. 
   **HINT:** When a program interacts with files, it is relative to the current working directory in
   which the program is being run. That is, the directory you are in when you type the `java` command.
   For a Java program, relative paths are relative to that directory. 
   
1. Take a moment to note the similarties between using `Censor` and the Unix `cat` utility.

1. From the `cs1302-hw02` directory, use the `Censor` program to display the contents of standard input.
   **HINT:** Read through the code to see what command-line argument you might use to read from standard 
   input.
   This may seem weird at first, but the program should allow you to type in lines of text to standard
   input. When you complete a line by hitting return, the program will print the line to standard input.
   The program will terminate once it reaches the end of the file. What does that mean for standard
   input? You can trigger the end of file (a.k.a. the `EOF`) by pressing `C-d`.

1. From the `cs1302-hw02` directory, run the `Censor` program with no command-line arguments. A run-time
   exception should occur. Answer the following questions about the exception in your notes:
   
   * What is the name of the exception?
   * Why did the exception occur?
   * Is this exception a checked or an unchecked exception? How can you tell?

1. There are multiple ways to fix the run-time exception that you encountered in the last step.
   Fix the problem in such a way that the following criteria are met whenever the exception occurs:
   
   * The program does not crash.
   * The exception message is stil displayed to standard error. To do this, you will need to call the
   `toString()` method on the exception object reference given in the `catch` statement.

   When displaying the exception message, something like the following will suffice 
   (replacing `<message>` with the actual exception message):

   ```
   Censor: <message>
   ```

1. From the `cs1302-hw02` directory, run the `Censor` program with no command-line arguments. What's the
   difference between this execution of the program and the one performed two steps earlier?

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-2-success?style=for-the-badge)

<hr/>

### Checkpoint 3 Steps - `MyCat.java`

1. Now, let's add some more functionality to the `Censor` program. Change the code so that one or more
   command-line arguments are accepted. The expected behavor is that `Censor` should print the files, in
   order, to standard output, effectively con<b>cat</b>enating the contents of the supplied files.

1. From the `cs1302-hw02` directory, use your enhanced `Censor` program to display the contents of the 
   following three files all passed in at once:`Utility.java`, standard input ("-"), and `Censor.java` 
   in that order! If your program does not currently allow "-" to be specified for arbitrary file names 
   in the list of command-line arguments, then modify it to accomodate that feature.

1. Run your enhanced `Censor` program by passing in two filenames as command-line arguments. Make sure
   the first file does not exist in the file system. Your program should catch the `FileNotFoundException`,
   print the appropriate message, and still print the contents of the second file (assuming it exists).
   
1. Update the comments in the source code to reflect any functionality that has been added since
   the beginning of this exercise.

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished%20Checkpoint-3-success?style=for-the-badge)

<hr/>

-->
### Submission Steps

**Each student needs to individually submit their own work.**

1. Create a plain text file called `SUBMISSION.md` directly inside the `cs1302-hw02`
   directory with the following information:

   1. Your name and UGA ID number; and
   1. Collaborator names, if any. 
   
   Here is an example of the contents of `SUBMISSION.md`.
   
   ```
   1. Sally Smith (811-000-999)
   2. Collaborators: Joe Allen, Stacie Mack
   ```

1. Change directories to the parent of `cs1302-hw02` (e.g., `cd ..` from `cs1302-hw02`). If you would like
   to make a backup tar file, the instructions are in the submissions steps for [hw01](https://github.com/cs1302uga/cs1302-hw01).
   We won't repeat those steps here and you can view them as optional.
   
1. Use the `submit` command to submit this exercise to `csci-1302`:
   
   ```
   $ submit cs1302-hw02 csci-1302
   ```
   
   Read the output of the submit command very carefully. If there is an error while submitting, then it will displayed 
   in that output. Additionally, if successful, the submit command creates a new receipt file in the directory you 
   submitted. The receipt file begins with rec and contains a detailed list of all files that were successfully submitted. 
   Look through the contents of the rec file and always remember to keep that file in case there is an issue with your submission.

   **Note:** You must be on Odin to submit.

<hr/>

![CP](https://img.shields.io/badge/Just%20Finished-Submission-success?style=for-the-badge)

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/) [![License: CC BY-NC 4.0](https://img.shields.io/badge/Instructor%20License-CC%20BY--NC%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Bradley J. Barnes, and the University of Georgia.
This work is licensed under 
a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public and licensed under
a <a rel="license" href="http://creativecommons.org/licenses/by-nc/4.0/">Creative Commons Attribution-NonCommercial 4.0 International License</a> to instructors at institutions of higher education.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
