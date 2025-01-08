package com.bigbrain.avanish;

import java.util.Objects;
import java.util.Scanner;

public class CommandHandler {

    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!Objects.equals(input, CMD.QUIT)) {
            performCommand(input.split(" "));
            input = scanner.nextLine();
        }
    }

    /**
     * Method with performs the inputted command/ calls the relevant method.
     * @param currentCommand current inputted command
     */
    public static void performCommand(String[] currentCommand) {
        if (currentCommand.length < 1) {
            System.out.println(CMD.ERROR);
            return;
        }
        switch (currentCommand[0]) {
            case CMD.START:

                break;

            case CMD.PASS:

                break;

            case CMD.MOVE:

                break;

            case CMD.PLACE:

                break;

            case CMD.PRINT:

                break;
        }
    }
}
