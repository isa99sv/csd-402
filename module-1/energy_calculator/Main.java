/*Colton Stone, January 13, 2026, Module 1.3 Assignment

This program will prompt the user to enter three values in order to calculate the energy required to heat an amount of water
from an initial temperature to a final temperature to

Formula:

    Q = waterMass * ( finalTemperature – initialTemperature ) * 4184

    /waterMass is water weight in kilograms

    /finalTemperature and initialTemperature are temperatures in Celsius

    /Q is the result in Joules*/


package energy_calculator;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initial_Temperature = 1;
        double final_Temperature = 1;
        double water = 1;
        double joules;
        double valid_Input = 0;
        /* This 'valid_Input' is used to check if all of the user's inputs are above 0 or not
        If the numbers they enter are below or equal to zero the user will be forced to restart their inputs */
        System.out.println("\nTo determine how much energy will be needed to heat your water from one temperature " +
                "to another you will need to enter the values below. ");
        System.out.println("\nAll values must be above the amount of 0 to be valid " +
                "otherwise you will be asked to enter the input again. ");



        try {
            do {
                System.out.println("\nFirst enter an valid number for your amount of water: ");
                water = scanner.nextDouble();
            } while (water <= valid_Input);
                System.out.println("You entered " + water + " kilograms of water");


                System.out.println();
                do {
                    System.out.println("\nNext enter the temperature level that your water will begin at: ");
                    initial_Temperature = scanner.nextDouble();
                }while (initial_Temperature <= valid_Input);
                System.out.println("You entered " + initial_Temperature + "°C");


                System.out.println();
                System.out.println("\nLastly the second temperature level must be a higher number than the starting temperature " +
                        "otherwise the program will not accept it.");
                do {
                    System.out.println("\nEnter the temperature level that your water will rise to: ");
                    final_Temperature = scanner.nextDouble();

                } while (final_Temperature <= initial_Temperature);
                System.out.println("You entered " + final_Temperature + "°C");


                final_Temperature = final_Temperature - initial_Temperature;
                joules = water * final_Temperature * 4184;
                System.out.println();
                System.out.println("\nIt will require " + joules + " joules to heat your water.");
            }


            catch(ArithmeticException e){
                System.out.println("Invalid input was entered.");
            }
            catch(InputMismatchException e){
                System.out.println("Only enter valid numbers.");
            }
            catch(Exception e){
                System.out.println("Error!");
        }
            finally{
                scanner.close();
                System.out.println();
            }




    }
}

