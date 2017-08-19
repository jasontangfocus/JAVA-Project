package com.tang;

public class WormPanel {

    private Worm worm;
    private int rows;
    private int cols;

    public WormPanel(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        worm = new Worm();
    }

    public void print() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1) {
                    System.out.print("-");
                } else if (j == 0 || j == cols - 1) {
                    System.out.print("|");
                } else if (worm.contains(i, j)) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public Worm getWorm() {
        return worm;
    }
}
