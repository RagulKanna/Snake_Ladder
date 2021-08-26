package com.assignment;

public class SnakeLadder
{
    public static void main(String[] args)
    {
        System.out.println("        Welcome to the Snake & Ladder Game      ");

        int Player_Position=0,dicenum,count=0;
        System.out.println("\nThe Position of the player at starting is " + Player_Position+"\n");

        for(int i=1; Player_Position <=99;++i)
        {

                dicenum = (int) (Math.floor(Math.random() * 6 % 7 + 1));
            int play = (int) (Math.random() * 3);


            if(Player_Position + dicenum >100)
            {
                System.out.println("The Number got while rolling dice " + dicenum+ ", If we add the Position gets above 100 not added");
                System.out.println("The Player_Position Reached 100 Successfully!!\n");
                Player_Position=100;

            }
            else
            {



                switch (play)
                {
                    case 0:
                        System.out.println("There is no play for player, so the positiion is " + Player_Position+"\n");
                        break;
                    case 1:
                           System.out.println("The Number got while rolling dice " + dicenum);
                            Player_Position = Player_Position + dicenum;
                        System.out.println("The player position get changed to " + Player_Position+" due to Ladder\n");
                        break;
                    case 2:
                        if (Player_Position > dicenum)
                            Player_Position = Player_Position - dicenum;
                        else
                            Player_Position = 0;
                        System.out.println("The Number got while rolling dice " + dicenum);
                        System.out.println("The player position get changed to " + Player_Position+" due to Snake\n");
                        break;
                }
            }
            count++;
        }
        System.out.println("\n The Player roll the dice for "+count+" times to reach Position 100");
        }

    }




