package com.tang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //TODO aoto-generate methods stub
        WormPanel pane = new WormPanel(15, 45);
        Scanner console = new Scanner(System.in);
        Worm worm = pane.getWorm();

        for (;;) {
            pane.print();
            System.out.println("Please input the direction");
            String cmd = console.nextLine();

            if (cmd.equalsIgnoreCase("U")) {
                worm.step(worm.UP);
            } else if (cmd.equalsIgnoreCase("D")) {
                worm.step(worm.Down);
            } else if (cmd.equalsIgnoreCase("L")) {
                worm.step(worm.Left);
            } else if (cmd.equalsIgnoreCase("R")) {
                worm.step(worm.Right);
            } else if (cmd.equalsIgnoreCase("q")) {
                System.out.println("See you later~");
                break;
            } else {
                worm.step();
            }
        }
    }
}
