package com.bigbrain.avanish;

import java.util.Objects;
import java.util.Scanner;

public class CommandHandler {

    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!Objects.equals(input, "QUIT")) {
            //performCommand(input.split(" "));
            input = scanner.nextLine();
        }
    }
}
