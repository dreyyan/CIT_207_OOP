package Utilities;

import java.util.Scanner;
import Utilities.Utility;

public class Utility {
    static Scanner scanner = new Scanner(System.in);

    // [ UTILITY ]: Mimic delay within specified milliseconds
    public static void delay(double delayMs) {
        try {
            Thread.sleep((long)(delayMs));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // [ UTILITY ]: Display UI header
    public static void displayHeader() {
        printAnimated("`~`~`~`~`~ SM Cinema ~`~`~`~`~`\n", 200);
    }

    // [ UTILITY ]: Display UI subheader
    public static void displaySubheader(String message) {
        printAnimated("[ " + message + " ]\n", 200);
    }

    // [ UTILITY ]: Display line format
    public static void displayLine(int length, String symbol) {
        System.out.println(symbol.repeat(length));

        try {
            Thread.sleep((long)(200));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // [ UTILITY ]: Mimic a clear console screen
    public static void clearScreen() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
    }

    // [ UTILITY ]: Prompt the user to press any key to continue
    public static void pressKeyToContinue() {
        System.out.print("Press any key to continue...");
        scanner.nextLine();
    }

    // [ UTILITY ]: Display text /w animation delay
    public static void printAnimated(String str, double delayMs) {
        System.out.print(str);
        try {
            Thread.sleep((long)(delayMs));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}