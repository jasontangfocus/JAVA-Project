package com.JohnT;

public class Main {

    public static void main(String[] args) {

       /* Player player = new Player();

        player.fullName = "Tang";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());*/

        EnhancedPlayer player = new EnhancedPlayer("Tim", 100, "Sword");
        System.out.println(player.getHealth());




    }
}
