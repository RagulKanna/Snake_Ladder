package com.assignment;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("        Welcome to the Snake & Ladder Game      ");

        int Player_Position=0,dicenum;

        for(int i=1; Player_Position <=99;i++)
        {
            System.out.println("\nThe Position of the player at starting is " + Player_Position);
            dicenum = (int) (Math.floor(Math.random() * 6 % 7 + 1));


            int play = (int) (Math.random() * 3);
            if (play == 1 || play == 2)
                System.out.println("\nThe Number got while rolling dice " + dicenum);


            switch (play) {
                case 0:
                    System.out.println("\nThere is no play for player, so the positiion is " + Player_Position);
                    break;
                case 1:
                    Player_Position = Player_Position + dicenum;
                    System.out.println("\nThe player position get changed to " + Player_Position);
                    break;
                case 2:
                    if (Player_Position > dicenum)
                        Player_Position = Player_Position - dicenum;
                    else
                        Player_Position = 0;
                    System.out.println("\nThe player position get changed to " + Player_Position);
                    break;
            }

            }
        }
    }




