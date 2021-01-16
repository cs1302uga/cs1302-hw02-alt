package cs1302.exceptions;

import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;

/**
 * A modified version of the Unix {@code cat} command that censors lines that
 * contain any word listed in the filename specified in the first command-line argument.
 * The program prints the contents of either a specified file or standard input to
 * standard output replacing each character of any censored line with an asterisk.
 *
 * For example, if "Tech" is a censored word and is found in one of the input lines,
 * the program censors the original line replacing each character of the line with
 * an asterisk. So, if the line read "Go Tech!", the censored output would be
 * "********" since the full line contains eight characters.
 */
public class Censor {

    /**
     * Entry point for the application. The following command-line arguments are expected:
     *    1) Required: The name of the file containing the censored words.
     *       Note: The name of the censored word file must be the first argument.
     *    2) Optional: Where the program should read its input from. Can be either:
     *       a) A single dash (-) indicating that the input should come from standard input.
     *       b) The name of a file indicating that the input should come from a regular file.
     *       Note: The program should accept any number of optional inputs in any order.
     *       In other words, the program should allow multiple file names and dashes to be
     *       given in any order in a single execution.
     *
     * @param args  the command-line arguments
     */
    public static void main(String[] args) {
        // Default to reading from standard input
        String filename;

        try {
            filename = args[1];
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            // No filename was provided - read from standard input.
            filename = "-";
        } // try

        try {
            String[] words = Utility.readCensoredWords(new File(args[0]));

            if (args.length == 1) {
                Utility.printStdInLines(words);
            } else {
                for (int i = 1; i < args.length; i++) {
                    filename = args[i];
                    if (filename.equals("-")) {
                        Utility.printStdInLines(words);
                    } else {
                        Utility.printFileLines(new File(filename), words);
                    } // if
                } // for
            } // else
        } catch (FileNotFoundException fnfe) {
            System.out.println("Censor: " + args[0] + " not found");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Censor: censored word filename not provided");
        } // try

    } // main

} // MyCat
