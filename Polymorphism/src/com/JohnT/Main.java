package com.JohnT;

import java.lang.invoke.SwitchPoint;

class Moive {
    private String name;

    public Moive(String name) {
        this.name = name;
    }

    public String plot() {
        return  "No Plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Moive {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "Plot of Jaws, A shark eats a lot of people";
    }

}

class IndependenceDay extends Moive {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attemp to take over planet earth";
    }
}

class Maze extends Moive {
    public Maze() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids escape maze";
    }
}

class  StarWars extends Moive {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over universe";
    }
}

class ForgetableMovive extends Moive {
    public ForgetableMovive() {
        super("Forgetabel");
    }

    //No plot method
}

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Moive moive = randomMovie();
            System.out.println("Movie #" + i + ": " + moive.getName() + "\n" + moive.plot() + "\n");
        }
    }

    public static Moive randomMovie() {
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("Random NUmber generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Maze();
            case 4:
                return new StarWars();
            case 5:
                return new ForgetableMovive();
        }

        return null;
    }

}
