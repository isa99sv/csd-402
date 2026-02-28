package FW;

import java.io.*;
import java.util.*;

/*Colton Stone, February 27, 2026, Module 9.2 Assignment

In this program I will write code to create a new file named 'data.file' then add ten randomly generated numbers to the file*/


public class Main {

    public static void numArray(ArrayList<Integer> numList) {
        Random randomNum = new Random();
        int listRange = 10;
        int maxRange = 50;

        for (int x = 0; x < listRange; x++) {
            int randGen = randomNum.nextInt(maxRange);
            numList.add(randGen);
        }

        System.out.println(" " + Arrays.toString(numList.toArray()));

    }

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numArray(numList);
        Scanner scanner = new Scanner(System.in);
        File file1 = new File("data.file");
        PrintWriter print;


        try {
            if (!file1.exists()) {
                System.out.println("\nCreating Data File: ");
                print = new PrintWriter(new FileOutputStream(file1, true));
                for (Integer x : numList) {
                    System.out.println(x.toString());
                    print.write(x.toString());
                    print.println();

                }
                print.close();
            }
        } catch (IOException e) {
            System.out.println("An IOException was thrown in the file creation");
        }


        try {

            System.out.println("\nReading New Data File: ");

            scanner = new Scanner(file1);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }

        catch (IOException e) {

            System.out.println("An IOException was thrown while reading the file");
        }


    }

}
