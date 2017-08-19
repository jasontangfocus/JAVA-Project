package com.tang;

import java.util.LinkedList;

public class Worm {

    //going up
    public static final int UP = 10;
    //going down
    public static final int Down = -10;
    //going left
    public static final int Left = -1;
    //going right
    public static final int Right = 1;

    //Choose the data structure of LinkedList for quick
    //inserting from both the head and tail
    private LinkedList<Node> nodes = new LinkedList<>();

    //direction variable
    private int dir;

    //initialize the snake
    public Worm() {
        nodes.add(new Node(3, 9));
        nodes.add(new Node(4, 9));
        nodes.add(new Node(5, 9));
        nodes.add(new Node(5, 10));
        nodes.add(new Node(5, 11));
        nodes.add(new Node(6, 11));
        nodes.add(new Node(7, 11));
        dir = Right;
    }

    //go for one step follow the current direction
    public void step() {

        //get the head node get(0)
        Node head = nodes.getFirst();

        //calculate the new head
        int i = head.getI() + dir/10;
        int j = head.getJ() + dir%10;
        head = new Node(i, j);

        //nodes.add(0, head)
        nodes.addFirst(head);

        //nodes.remove(nodes.size() - 1)
        nodes.removeLast();
    }

    //change direction, dir is going to be the new direction
    //being input
    public void step(int dir) {

        if (this.dir + dir == 0) {
            throw new RuntimeException("Can not go to this direction!");
        }

        this.dir = dir;
        step();
    }

    public boolean contains(int i, int j) {
        return nodes.contains(new Node(i, j));
    }

    public String toString() {
        return nodes.toString();
    }
}
