/**
 * @author lohbecjz@mail.uc.edu
 */

import java.util.Scanner;

public class Ass01_RockPaperScissors
{
    public static void main(String[] args)
    {
        // Declare variables
        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";
        String playAgain = "";

        // Prompt and input
        System.out.println("Shall we play a game?");
        System.out.println("How about Rock, Paper, Scissors?");

        do
        {
            while (true)
            {
                System.out.print("Player A, choose a move (R, P, or S): ");
                playerA = in.nextLine();
                if ((playerA.equalsIgnoreCase("R")) || (playerA.equalsIgnoreCase("P")) || (playerA.equalsIgnoreCase("S")))
                {
                    break;
                }
                else
                {
                    System.out.println(playerA + " is not a valid move.");
                }
            }

            while (true)
            {
                System.out.print("Player B, choose a move (R, P, or S): ");
                playerB = in.nextLine();
                if ((playerB.equalsIgnoreCase("R")) || (playerB.equalsIgnoreCase("P")) || (playerB.equalsIgnoreCase("S")))
                {
                    break;
                }
                else
                {
                    System.out.println(playerB + " is not a valid move.");
                }
            }

            // Process and output
            if (playerA.equalsIgnoreCase("R"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("R X R, It's a tie!");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("R X P, Paper covers Rock, Player B wins!");
                }
                else // player B must be scissors
                {
                    System.out.println("R X S, Rock breaks Scissors, Player A wins!");
                }
            }

            if (playerA.equalsIgnoreCase("P"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("P X R, Paper covers Rock, Player A wins!");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("P X P, It's a tie!");
                }
                else // player B must be scissors
                {
                    System.out.println("P X S, Scissors cuts Paper, Player B wins!");
                }

            }

            if (playerA.equalsIgnoreCase("S"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("S X R, Rock breaks Scissors, Player B wins!");
                } else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("S X P, Scissors cuts Paper, Player A wins!");
                }
                else // player B must be scissors
                {
                    System.out.println("S X S, It's a tie!");
                }
            }

            System.out.print("Play again (Y or N): ");
            playAgain = in.nextLine();

        } while (playAgain.equalsIgnoreCase("Y"));
    }
}