package com.assignment;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("        Welcome to the Snake & Ladder Game      ");

        int Player_Position=0;
        System.out.println("\nThe Position of the player at starting is "+Player_Position);
        int dicenum=(int)(Math.floor(Math.random() * 6 % 7 +1));
        System.out.println("\nThe Number got while rolling dice "+dicenum);
    }
}
