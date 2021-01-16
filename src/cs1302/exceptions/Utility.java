package cs1302.exceptions;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * A utility class for printing lines from files using {@code Scanner} objects.
 */
public class Utility {

    /**
     * Reads the censored words from the provided {@code file} and
     * returns a {@code String} array of the censored words.
     *
     * @param file the file containing the censored words.
     * @return the array containing the censored words (one per index).
     * @throws FileNotFoundException if the specified file is not found.
     */
    public static String[] readCensoredWords(File file) throws FileNotFoundException {

        // You should replace the line below with your implementation of this method.
        throw new UnsupportedOperationException("Method not yet implemented");

    } // readCensoredWords

    /**
     * Prints censored lines using the given {@code Scanner} object.
     *
     * @param input the given input scanner.
     * @param censored an array of the censored words.
     */
    private static void printCensoredLines(Scanner input, String[] censored) {

        // You should replace the line below with your implementation of this method.
        throw new UnsupportedOperationException("Method not yet implemented");

    } // printCensoredLines

    /**
     * Converts the specified {@code String} to a sequence of asterisks of the
     * same length as the original. For example, if {@code line} contains "ABCDEF",
     * the method would return "******".
     *
     * @param line the {@code String} to convert.
     * @return the converted {@code String} containing only asterisks.
     */
    private static String asterisk(String line) {

        // You should replace the line below with your implementation of this method.
        throw new UnsupportedOperationException("Method not yet implemented");

    } // asterisk

    /**
     * Compares each word in the given {@code line} against the list of censored
     * words specified by the {@code censored} array and censors the line by turning
     * every character in the line into an asterisk if a censored word is found. If no censored
     * word is found, the method simply returns the original line.
     *
     * @param line the line to be censored
     * @param censored an array of the censored words.
     * @return the censored version of the line. Will either be the original line or a
     * sequence of asterisks.
     */
    private static String censor(String line, String[] censored) {

        // You should replace the line below with your implementation of this method.
        throw new UnsupportedOperationException("Method not yet implemented");

    } // censor

    /**
     * Prints lines from the given file.
     *
     * @param file the given file
     * @param censored an array of the censored words.
     * @throws FileNotFoundException if {@code file} is not found
     */
    public static void printFileLines(File file, String[] censored) throws FileNotFoundException {

        // You should replace the line below with your implementation of this method.
        throw new UnsupportedOperationException("Method not yet implemented");

    } // printFileLines

    /**
     * Censors lines coming from standard input.
     *
     * @param censored an array of the censored words.
     */
    public static void printStdInLines(String[] censored) {

        // You should replace the line below with your implementation of this method.
        throw new UnsupportedOperationException("Method not yet implemented");

    } // printStdInLines

} // Printer
