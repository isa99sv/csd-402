package J1DArray;

import java.util.Arrays;

/*Colton Stone, February 6, 2026, Module 5.2 Assignment

In this program I will write use the first two headers to display the largest element of a one-dimensional array
and then use two other headers to do the same with the smallest element.*/


public class Main {

    public static int[] locateLargest(double[][] arrayParam) {

        int[] max = new int[]{0,0};
        double maxarray = arrayParam[0][0];

        for (int x = 0; x < arrayParam.length; x++) {
            for (int y = 0; y < arrayParam[x].length; y++) {
                if (arrayParam[x][y] > maxarray) {
                    maxarray = arrayParam[x][y];
                    max[0] = x;
                    max[0] = y;
                }
            }

        }

        return max;


    }



    public static int[] locateLargest(int[][] arrayParam) {

        int[] max = new int[]{0, 0};
        int maxarray = arrayParam[0][0];

        for (int x = 0; x < arrayParam.length; x++) {
            for (int y = 0; y < arrayParam[x].length; y++) {
                if (arrayParam[x][y] > maxarray) {
                    maxarray = arrayParam[x][y];
                    max[0] = x;
                    max[0] = y;
                }
            }

        }

        return max;

    }






    public static int[] locateSmallest(double[][] arrayParam) {

        int[] min = new int[]{0, 0};
        double minarray = arrayParam[0][0];

        for (int x = 0; x < arrayParam.length; x++) {
            for (int y = 0; y < arrayParam[x].length; y++) {
                if (arrayParam[x][y] < minarray) {
                    minarray = arrayParam[x][y];
                    min[0] = x;
                    min[0] = y;
                }
            }

        }

        return min;
    }

    public static int[] locateSmallest(int[][] arrayParam) {

        int[] min = new int[]{0, 0};
        int minarray = arrayParam[0][0];

        for (int x = 0; x < arrayParam.length; x++) {
            for (int y = 0; y < arrayParam[x].length; y++) {
                if (arrayParam[x][y] < minarray) {
                    minarray = arrayParam[x][y];
                    min[0] = x;
                    min[0] = y;
                }
            }

        }

        return min;

    }




    public static void main (String[]args)
    {
        double[][] array1 = {{1.0,2.0,3.0},
                             {4.0,5.0,6.0}};
        int[][] array2 = {{1,2,3},
                          {4,5,6}};

        int[] max_element1 = locateLargest(array1);
        int[] min_element1 = locateSmallest(array1);
        int[] max_element2 = locateLargest(array2);
        int[] min_element2 = locateSmallest(array2);

        System.out.println(("\nIn the double array the position of the largest element is " + Arrays.toString(max_element1)) +
                " and the position of the smallest element is " + Arrays.toString(min_element1));
        System.out.println(Arrays.deepToString(array1));


        System.out.println();
        System.out.println(("\nIn the int array the position of the largest element is " + Arrays.toString(max_element2)) +
                " and the position of the smallest element is " + Arrays.toString(min_element2));
        System.out.println(Arrays.deepToString(array2));

    }

}



