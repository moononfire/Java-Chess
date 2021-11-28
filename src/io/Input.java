package io;

import java.util.Scanner;

public class Input {

    Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String get(String message) {
        System.out.println(message);
        String line = scanner.nextLine();
        return line;
    }
}
