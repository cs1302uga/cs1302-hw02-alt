package cs1302.exceptions;

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
     *
     * <h3>Required</h3>
     * The name of the file containing the censored words.
     * Note: The name of the censored word file must be the first argument.
     *
     * <h3>Optional</h3>
     * Where the program should read its input from. Can be either:
     * a) A single dash (-) indicating that the input should come from standard input;
     * b) The name of a file indicating that the input should come from a regular file.
     * Note: The program should accept any number of optional inputs in any order.
     * In other words, the program should allow multiple file names and dashes to be
     * given in any order in a single execution.
     *
     * @param args  the command-line arguments
     */
    public static void main(String[] args) {

        // You should replace the line below with your implementation of the main method.
        // Your code should use the methods in the Utility class (once implemented) to provide
        // the bulk of the functionality.
        // You will need to handle exceptions in this method.
        throw new UnsupportedOperationException("Main method not yet implemented");

    } // main

} // Censor
