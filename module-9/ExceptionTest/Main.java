package ExceptionTest;

import java.util.*;

/*Colton Stone, February 27, 2026, Module 9.2 Assignment

For this assignment I will create an ArrayList which has a certain number of strings, use a 'for-each' loop print the list's collection,
 and then prompt the user to state which element that they want to be displayed from the list*/


class Main {

    public static void foodArray(ArrayList<String> foodList) {

        foodList.add("apples");
        foodList.add("baked beans");
        foodList.add("baked potatoes");
        foodList.add("chicken");
        foodList.add("corn");
        foodList.add("french fries");
        foodList.add("grapes");
        foodList.add("grilled chesse");
        foodList.add("lasagna");
        foodList.add("porkchop");
        foodList.add("spaghetti");
        foodList.add("white rice");

        for (String x : foodList) {
            System.out.println(x);
        }

    }

    public static void main(String[] args) {
        ArrayList<String> foodList = new ArrayList<>();
        System.out.println("This is my list of food items: \n ");
        foodArray(foodList);

        System.out.println("\nWhich food item is your favorite?:");
        Scanner scanner = new Scanner(System.in);
        String foodChoice = scanner.nextLine();
        foodChoice = foodChoice.toLowerCase();

        try {

            if (foodList.contains(foodChoice)) {
                System.out.println("\nYour favorite food is " + foodChoice);
            }
            else {
                throw new ArrayIndexOutOfBoundsException();
            }
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nOut of Bounds!. Try again!");
        }

        finally {
            scanner.close();
        }


    }
}

