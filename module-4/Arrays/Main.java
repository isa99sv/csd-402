package Arrays;

import java.util.Arrays;

/*Colton Stone, January 30, 2026, Module 4.2 Assignment

In this program I will write four overloaded methods that return the average value of each array*/


public class Main {


    public static short average (short[] array) {

        short sum = 0;

        for (short x : array) {
            sum += x;
        }
        return sum;
    }


    public static int average (int[] array) {

        int sum = 0;

        for (int x : array) {
            sum += x;
        }
        return sum;
    }


    public static long average (long[] array) {

        long sum = 0;

        for (long x : array) {
            sum += x;
        }
        return sum;
    }


    public static double average (double [] array) {

        double sum = 0;

        for (double x : array) {
            sum += x;
        }
        return sum;
    }


    public static void main(String[] args) {

        short[] shortArray = {1,2,3,4,5};
        int[] intArray = {1,2,3,4,5,6};
        long[] longArray = {1,2,3,4,5,6,7};
        double[] doubleArray = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0};

        short shortavg = average(shortArray);
        System.out.println("\nThe original elements of this short array are: " + Arrays.toString(shortArray)
        + "\nAnd its average is: " + shortavg/shortArray.length);

        int intavg = average(intArray);
        System.out.println("\nThe original elements of this int array are: " + Arrays.toString(intArray)
                + "\nAnd its average is: " + intavg/intArray.length);

        long longavg = average(longArray);
        System.out.println("\nThe original elements of this long array are: " + Arrays.toString(longArray)
                + "\nAnd its average is: " + longavg/longArray.length);

        double doubleavg = average(doubleArray);
        System.out.println("\nThe original elements of this double array are: " + Arrays.toString(doubleArray)
                + "\nAnd its average is: " + doubleavg/doubleArray.length);


    }



}