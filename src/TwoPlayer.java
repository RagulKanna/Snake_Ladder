public class TwoPlayer {
    public static void main(String[] args) {
        int Player_Posi1 = 0, Player_Posi2 = 0, dicenum,n=0,count1=0,count2=0;


        for (int j = 0; Player_Posi1 <=99 && Player_Posi2 <=99;j++) {


               n=j%2;


            switch (n) {
                case 0: {
                    System.out.println("The Player 1\n");
                    dicenum = (int) (Math.floor(Math.random() * 6 % 7 + 1));
                    count1++;
                    int play1 = (int) (Math.random() * 3);


                    if (Player_Posi1 + dicenum > 100) {
                        System.out.println("The Number got while rolling dice " + dicenum + ", If we add the Position gets above 100 not added");
                        System.out.println("The Player_Position Reached 100 Successfully!!\n");
                        System.out.println("\n\n    Player 1 Won the game!!!!!!");
                        Player_Posi1 = 100;


                    } else {


                        switch (play1) {
                            case 0:
                                System.out.println("There is no play for player, so the positiion is " + Player_Posi1 + "\n");
                                break;
                            case 1:
                                System.out.println("The Number got while rolling dice " + dicenum);
                                Player_Posi1 = Player_Posi1 + dicenum;
                                System.out.println("The player position get changed to " + Player_Posi1 + " due to Ladder\n");
                                j++;
                                break;
                            case 2:
                                if (Player_Posi1 > dicenum)
                                    Player_Posi1 = Player_Posi1 - dicenum;
                                else
                                    Player_Posi1 = 0;
                                System.out.println("The Number got while rolling dice " + dicenum);
                                System.out.println("The player position get changed to " + Player_Posi1 + " due to Snake\n");
                                break;
                        }
                    }
                }
                break;
                case 1: {
                    System.out.println("The Player 2\n");
                    dicenum = (int) (Math.floor(Math.random() * 6 % 7 + 1));
                    count2++;
                    int play2 = (int) (Math.random() * 3);


                    if (Player_Posi2 + dicenum > 100) {
                        System.out.println("The Number got while rolling dice " + dicenum + ", If we add the Position gets above 100 not added");
                        System.out.println("The Player_Position Reached 100 Successfully!!\n");
                        System.out.println("\n\n    Player 2 Won the game!!!!!!");
                        Player_Posi2 = 100;

                    } else {


                        switch (play2) {
                            case 0:
                                System.out.println("There is no play for player, so the positiion is " + Player_Posi2 + "\n");
                                break;
                            case 1:
                                System.out.println("The Number got while rolling dice " + dicenum);
                                Player_Posi2 = Player_Posi2 + dicenum;
                                System.out.println("The player position get changed to " + Player_Posi2 + " due to Ladder\n");
                                j++;
                                break;

                            case 2:
                                if (Player_Posi2 > dicenum)
                                    Player_Posi2 = Player_Posi2 - dicenum;
                                else
                                    Player_Posi2 = 0;
                                System.out.println("The Number got while rolling dice " + dicenum);
                                System.out.println("The player position get changed to " + Player_Posi2 + " due to Snake\n");
                                break;
                        }
                    }
                }
                break;
            }
                }
        }
        }

