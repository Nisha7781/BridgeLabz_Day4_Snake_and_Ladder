
public class Snake_and_Ladder {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Snake and ladder game with two players...");
        int PlayersPosition = 0;
        int PlayersPosition1 = 0;
        int count1 = 0;
        int count2 = 0;

        boolean turn = true;

        while(PlayersPosition != 100 && PlayersPosition1 != 100)
        {
            if(turn == true)
            {
                System.out.println("Player 1 is at Position "+ PlayersPosition);
                int dice = (int) (Math.random()*6+1);
                System.out.println("Dice rolls by: "+ dice);
                count1++;
                int currentOption = (int)(Math.random()*3+1);
                switch(currentOption)
                {
                    case 1:
                        System.out.println("Option is No Play");
                        System.out.println("Player stays in the same position");
                        System.out.println("Position of player 1 is : "+ PlayersPosition);
                        turn = false;
                        break;

                    case 2:
                        System.out.println("Option got is Ladder");
                        System.out.println("Player moves forward by "+dice);
                        PlayersPosition = PlayersPosition + dice;
                        System.out.println("Position of player 1 is: "+ PlayersPosition);
                        break;

                    case 3:
                        System.out.println("Option got is Snake");
                        System.out.println("Player moves backword by "+dice);
                        PlayersPosition = PlayersPosition - dice;
                        System.out.println("Position of player 1 is: "+ PlayersPosition);
                        turn = false;
                }
                System.out.println(" ");

                if(PlayersPosition < 0)
                {
                    PlayersPosition = 0;
                }
                if(PlayersPosition > 100)
                {
                    PlayersPosition = PlayersPosition - dice;
                }

            }
            else
            {
                System.out.println("Player 2 is at Position "+ PlayersPosition1);
                int dice = (int) (Math.random()*6+1);
                System.out.println("Dice rolls by: "+ dice);
                count2++;
                int currentOption = (int)(Math.random()*3+1);
                switch(currentOption)
                {
                    case 1:
                        System.out.println("Option is No Play");
                        System.out.println("Player stays in the same position");
                        System.out.println("Position of player 2 is : "+ PlayersPosition1);
                        turn = true;
                        break;

                    case 2:
                        System.out.println("Option got is Ladder");
                        System.out.println("Player moves forward by "+dice);
                        PlayersPosition1 = PlayersPosition1 + dice;
                        System.out.println("Position of player 2 is: "+ PlayersPosition1);
                        break;

                    case 3:
                        System.out.println("Option got is Snake");
                        System.out.println("Player moves backword by "+dice);
                        PlayersPosition1 = PlayersPosition1 - dice;
                        System.out.println("Position of player 2 is: "+ PlayersPosition1);
                        turn = true;
                }
                System.out.println(" ");

                if(PlayersPosition1 < 0)
                {
                    PlayersPosition1 = 0;
                }
                if(PlayersPosition1 > 100)
                {
                    PlayersPosition1 = PlayersPosition1 - dice;
                }

            }
            System.out.println(" ");
        }

        if(PlayersPosition == 100)
        {
            System.out.println("Player1 Rolled Dice "+count1+" times");
            System.out.println("Player1 won...");
        }
        else {
            System.out.println("Player2 Rolled Dice "+count2+" times");
            System.out.println("Player2 won...");
        }

    }
}