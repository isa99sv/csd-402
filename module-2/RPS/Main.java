package RPS;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/*Colton Stone, January 24, 2026, Module 2.2 Assignment

This program will simulate a rock-paper-scissors game with the user entering a number
and the cpu also randomly entering a number to decide if the user or cpu wins
 */




public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choicechecker;
        int cpuchoice;
        int userchoice = 0;

        System.out.println("\nIn this game of rock-paper-scissors the cpu will choose first " +
                "then you will go second and both of your results will be displayed to show the winner.");
        cpuchoice = (int) ((Math.random() * (4 - 1)) + 1);
        System.out.println("\nThe cpu has made their selection.");
        System.out.println();
        System.out.println("\nNow it is your turn");
        System.out.println("\n(Push '1' for rock, '2' for paper, or '3' for scissors):");


        try {
            do {
                choicechecker = 0;
                userchoice = scanner.nextInt();
                switch (userchoice) {
                    case 1:
                        System.out.println("You selected rock.");
                        break;
                    case 2:
                        System.out.println("You selected paper.");
                        break;
                    case 3:
                        System.out.println("You selected scissors.");
                        break;
                    default:
                        System.out.println("\nYou choose an invalid answer");
                        System.out.println("\nTry again" +
                                " (Push '1' for rock, '2' for paper, or '3' for scissors):");
                        choicechecker = 1;
                }

            } while (choicechecker == 1);

        } catch (ArithmeticException e) {
            System.out.println("Invalid input was entered.");
        } catch (InputMismatchException e) {
            System.out.println("Only enter valid numbers.");
        } catch (Exception e) {
            System.out.println("An error was made.");
        } finally {
            scanner.close();
            System.out.println();
        }


        if (cpuchoice == 1) {
            System.out.println("Computer choose rock.");
        } else if (cpuchoice == 2) {
            System.out.println("Computer choose paper.");
        } else if (cpuchoice == 3) {
            System.out.println("Computer choose scissors.");
        }

        if (userchoice == 1) {
            System.out.println("User choose rock.");
        } else if (userchoice == 2) {
            System.out.println("User choose paper.");
        } else if (userchoice == 3) {
            System.out.println("User choose scissors.");
        }


        if (cpuchoice == 1 && userchoice == 1) {
            System.out.println("The result is a draw");
        } else if (cpuchoice == 1 && userchoice == 2) {
            System.out.println("You win");
        } else if (cpuchoice == 1 && userchoice == 3) {
            System.out.println("The computer wins");
        } else if (cpuchoice == 2 && userchoice == 1) {
            System.out.println("You win");
        } else if (cpuchoice == 2 && userchoice == 2) {
            System.out.println("The result is a draw");
        } else if (cpuchoice == 2 && userchoice == 3) {
            System.out.println("The computer wins");
        } else if (cpuchoice == 3 && userchoice == 1) {
            System.out.println("You win");
        } else if (cpuchoice == 3 && userchoice == 2) {
            System.out.println("The computer wins");
        } else if (cpuchoice == 3 && userchoice == 3) {
            System.out.println("The result is a draw");

        }
    }

}

