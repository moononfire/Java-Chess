package io;

import app.App;

import java.util.Scanner;

public class Input {

    Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getMove() {
        String line = scanner.nextLine();
        while (!(line.charAt(0)>=65 && line.charAt(0)<=72 &&
                line.charAt(2)>=65 && line.charAt(2)<=72 &&
                line.charAt(1)>=49 && line.charAt(1)<=56 &&
                line.charAt(3)>=49 && line.charAt(3)<=56) || line.length() != 4) {
            App.write("This is not an accepted move!");
            line = scanner.nextLine();
        }
        return line;
    }
}
