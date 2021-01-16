package cs1302.exceptions;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

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
     */
    public static String[] readCensoredWords(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);

        // Assumes that the first token only contains the number of words in the file.
        int numWords = input.nextInt();

        String[] words = new String[numWords];

        for (int i = 0; i < words.length; i++) {
            words[i] = input.next();
            System.out.println(words[i]);
        } // for

        return words;
    } // readCensoredWords

    /**
     * Prints censored lines using the given {@code Scanner} object.
     *
     * @param input the given input scanner.
     * @param censored an array of the censored words.
     */
    private static void printCensoredLines(Scanner input, String[] censored) {
        while (input.hasNextLine()) {
            String line = censor(input.nextLine(), censored);
            System.out.println(line);
        } // while
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
        String result = "";
        for (int i = 0; i < line.length(); i++) {
            result += "*";
        } // for
        return result;
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
        String[] words = line.split(" ");

        for (String word: words) {
            if (Arrays.stream(censored).anyMatch(s -> s.toLowerCase().equals(word.toLowerCase()))) {
                // Found a censored word
                return asterisk(line);
            } // if
        } // for

        return line;
    } // censored

    /**
     * Prints lines from the given file.
     *
     * @param file the given file
     * @param censored an array of the censored words.
     * @throws FileNotFoundException if {@code file} is not found
     */
    public static void printFileLines(File file, String[] censored) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        printCensoredLines(input, censored);
    } // printFileLines

    /**
     * Censors lines coming from standard input.
     *
     * @param censored an array of the censored words.
     */
    public static void printStdInLines(String[] censored) {
        Scanner input = new Scanner(System.in);
        printCensoredLines(input, censored);
    } // printStdInLines

} // Printer
