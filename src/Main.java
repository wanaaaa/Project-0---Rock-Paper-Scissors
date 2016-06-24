/**
 * Created by ubun1604 on 6/23/16.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> winners = new ArrayList<>();
        boolean continueStop = true;

        while (continueStop) {
            System.out.println("Main Manu\n======\n 1. Type 'play' to play\n 2. Type 'history' to view your game history\n " +
                    "Type 'quit' to stop playing");
            Scanner scan = new Scanner(System.in);
            String playHistory = scan.next();

            if (playHistory.endsWith("history")) {
                System.out.println("The winner history is " + winners);
            } else if (playHistory.endsWith("play")) {
                String winner = playingGame();
                winners.add(winner);
                System.out.println("The winner is " + winner + "////////////////////////////");
            } else if (playHistory.equals("quit")) {
                continueStop = false;
                System.out.print("End of game");
            }
            else {
                System.out.println("Type again");
            }
        }

    } //End of main

    public static String playingGame() {

        String whoWin = "";
        Random rand = new Random();
        int rpsNum = rand.nextInt(60) % 3;

        String computerChoice;

        if (rpsNum == 0) {
            computerChoice = "rock";
        } else if (rpsNum == 1) {
            computerChoice = "paper";
        } else {
            computerChoice = "scissors";
        }

        boolean typeRigt = true ;
        while (typeRigt) {
            System.out.println("Computer Choice is " + computerChoice +" \nType your choice: rock or paper or scissors");
            Scanner scan = new Scanner(System.in);
            String playerChoice = scan.next();
            if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
                typeRigt = false;
//////////////////////////////////////////////////////////////
                if (computerChoice.equals(playerChoice)) {
                    System.out.println("We tie");
                    whoWin = "tie";
                } else if (computerChoice.equals("rock")) {
                    if (playerChoice.equals("paper")) {
                        System.out.println("Player win");
                        whoWin = "player";
                    } else if (playerChoice.equals("scissors")) {
                        System.out.println("Computer win");
                        whoWin = "computer";
                    }
                } else if (computerChoice.equals("paper")) {
                    if (playerChoice.equals("rock")) {
                        System.out.println("Computer win");
                        whoWin = "computer";
                    } else if (playerChoice.equals("scissors")) {
                        System.out.println("Player win");
                        whoWin = "player";
                    }
                } else if (computerChoice.equals("scissors")) {
                    if (playerChoice.equals("rock")) {
                        System.out.println("Player win");
                        whoWin = "player";
                    } else if (playerChoice.equals("paper")) {
                        System.out.println("computer win");
                        whoWin = "computer";
                    }
                }
////////////////////////////////////////////////////////////////
            } else {
                typeRigt = true;
                System.out.println("Choose again!!!!!!!");
            }
        }

        return whoWin;

    }//End of playingGame

} // End of Main