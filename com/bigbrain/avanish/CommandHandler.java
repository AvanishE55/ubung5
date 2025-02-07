package com.bigbrain.avanish;

import java.util.Objects;
import java.util.Scanner;

public class CommandHandler {

    private static Scanner scanner;
    private static Game game;

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
                if (currentCommand.length != 2) { //if even number - move is not correctly paired
                    System.out.println(CMD.ERROR);
                    return;
                }
                game = new Game(currentCommand[1]);
                break;

            case CMD.PASS:
                game.turn();
                break;

            case CMD.MOVE:
                if (currentCommand.length % 2 != 0) { //if odd number - move is not correctly paired
                    System.out.println(CMD.ERROR);
                    return;
                }
                break;

            case CMD.PLACE:
                if (currentCommand.length != 4) { //if even number - move is not correctly paired
                    System.out.println(CMD.ERROR);
                    return;
                }
                break;

            case CMD.PRINT:
                game.print();

                break;
        }
    }
}
