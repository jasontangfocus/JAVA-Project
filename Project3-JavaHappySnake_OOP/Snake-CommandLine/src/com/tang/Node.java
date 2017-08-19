package com.tang;

public class Node {

    private int i;
    private int j;

    public Node() {

    }

    public Node(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public String toString() {
        return "[" + i + "," + j + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (obj instanceof Node) {
            Node other = (Node)obj;
            return this.i == other.i&&this.j == other.j;
        }

        return false;
    }

    public int hashCode() {
        return i*10000 + j;
    }
}
