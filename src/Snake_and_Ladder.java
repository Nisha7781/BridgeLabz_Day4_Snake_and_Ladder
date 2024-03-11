
public class Snake_and_Ladder {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Snake and ladder game with single player...");
        int PlayersPosition = 0;

        while(PlayersPosition != 100)
        {
            int dice = (int) (Math.random()*6+1);
            System.out.println("Dice rolls by: "+ dice);

            int currentOption = (int)(Math.random()*3+1);
            switch(currentOption)
            {
                case 1:
                    System.out.println("NO PLAY");
                    System.out.println("Player stays in the same position");
                    System.out.println("Position of player 1 is : "+ PlayersPosition);
                    break;

                case 2:
                    System.out.println("Ladder");
                    System.out.println("Player moves forward by "+dice);
                    PlayersPosition = PlayersPosition + dice;
                    System.out.println("Position of player 1 is: "+ PlayersPosition);
                    break;

                case 3:
                    System.out.println("Snake");
                    System.out.println("Player moves backword by "+dice);
                    PlayersPosition = PlayersPosition - dice;
                    System.out.println("Position of player 1 is: "+ PlayersPosition);
            }
            System.out.println(" ");

            if(PlayersPosition < 0)
            {
                PlayersPosition = 0;
            }

        }
    }
}