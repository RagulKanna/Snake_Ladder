package com.assignment;

import java.util.Scanner;

public class SnakeLadder
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("        Welcome to the Snake & Ladder Game      ");

        System.out.println("Enter no of Player( 1 or  2 ): ");
        int player =s.nextInt();
        switch(player) {
            case 1:
                int Player_Position = 0, dicenum, count = 0;
                System.out.println("\nThe Position of the player at starting is " + Player_Position + "\n");

                for (int i = 1; Player_Position <= 99; ++i) {

                    dicenum = (int) (Math.floor(Math.random() * 6 % 7 + 1));
                    int play = (int) (Math.random() * 3);


                    if (Player_Position + dicenum > 100) {
                        System.out.println("The Number got while rolling dice " + dicenum + ", If we add the Position gets above 100 not added");
                        System.out.println("The Player_Position Reached 100 Successfully!!\n");
                        Player_Position = 100;

                    } else {


                        switch (play) {
                            case 0:
                                System.out.println("There is no play for player, so the positiion is " + Player_Position + "\n");
                                break;
                            case 1:
                                System.out.println("The Number got while rolling dice " + dicenum);
                                Player_Position = Player_Position + dicenum;
                                System.out.println("The player position get changed to " + Player_Position + " due to Ladder\n");
                                break;
                            case 2:
                                if (Player_Position > dicenum)
                                    Player_Position = Player_Position - dicenum;
                                else
                                    Player_Position = 0;
                                System.out.println("The Number got while rolling dice " + dicenum);
                                System.out.println("The player position get changed to " + Player_Position + " due to Snake\n");
                                break;
                        }
                    }
                    count++;
                }
                System.out.println("\n The Player roll the dice for " + count + " times to reach Position 100");
                break;

            case 2:
                int Player_Posi1 = 0, Player_Posi2 = 0, dicenum1, n = 0, count1 = 0, count2 = 0;


                for (int j = 0; Player_Posi1 <= 99 && Player_Posi2 <= 99; j++) {


                    n = j % 2;


                    switch (n) {
                        case 0: {
                            System.out.println("The Player 1\n");
                            dicenum1 = (int) (Math.floor(Math.random() * 6 % 7 + 1));
                            count1++;
                            int play1 = (int) (Math.random() * 3);


                            if (Player_Posi1 + dicenum1 > 100) {
                                System.out.println("The Number got while rolling dice " + dicenum1 + ", If we add the Position gets above 100 not added");
                                System.out.println("The Player_Position Reached 100 Successfully!!\n");
                                System.out.println("\n\n    Player 1 Won the game!!!!!!");
                                Player_Posi1 = 100;


                            } else {


                                switch (play1) {
                                    case 0:
                                        System.out.println("There is no play for player, so the positiion is " + Player_Posi1 + "\n");
                                        break;
                                    case 1:
                                        System.out.println("The Number got while rolling dice " + dicenum1);
                                        Player_Posi1 = Player_Posi1 + dicenum1;
                                        System.out.println("The player position get changed to " + Player_Posi1 + " due to Ladder\n");
                                        j++;
                                        break;
                                    case 2:
                                        if (Player_Posi1 > dicenum1)
                                            Player_Posi1 = Player_Posi1 - dicenum1;
                                        else
                                            Player_Posi1 = 0;
                                        System.out.println("The Number got while rolling dice " + dicenum1);
                                        System.out.println("The player position get changed to " + Player_Posi1 + " due to Snake\n");
                                        break;
                                }
                            }
                        }
                        break;
                        case 1: {
                            System.out.println("The Player 2\n");
                            dicenum1 = (int) (Math.floor(Math.random() * 6 % 7 + 1));
                            count2++;
                            int play2 = (int) (Math.random() * 3);


                            if (Player_Posi2 + dicenum1 > 100) {
                                System.out.println("The Number got while rolling dice " + dicenum1 + ", If we add the Position gets above 100 not added");
                                System.out.println("The Player_Position Reached 100 Successfully!!\n");
                                System.out.println("\n\n    Player 2 Won the game!!!!!!");
                                Player_Posi2 = 100;

                            } else {


                                switch (play2) {
                                    case 0:
                                        System.out.println("There is no play for player, so the positiion is " + Player_Posi2 + "\n");
                                        break;
                                    case 1:
                                        System.out.println("The Number got while rolling dice " + dicenum1);
                                        Player_Posi2 = Player_Posi2 + dicenum1;
                                        System.out.println("The player position get changed to " + Player_Posi2 + " due to Ladder\n");
                                        j++;
                                        break;

                                    case 2:
                                        if (Player_Posi2 > dicenum1)
                                            Player_Posi2 = Player_Posi2 - dicenum1;
                                        else
                                            Player_Posi2 = 0;
                                        System.out.println("The Number got while rolling dice " + dicenum1);
                                        System.out.println("The player position get changed to " + Player_Posi2 + " due to Snake\n");
                                        break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
        }
        }

    }




