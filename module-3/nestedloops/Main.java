package nestedloops;

/*Colton Stone, January 25, 2026, Module 3.2 Assignment

In this program I will use nested loops to display a shape*/




public class Main {

    public static void main(String[] args) {
        char symbol = '@';
        int cols = 7;

        for (int x = 1; x <= 1; x++) {
            System.out.print(" ");
            for (int y = 1; y<=2; y++) {
                System.out.printf("%3d", x * 1);
                System.out.print("  " +  symbol);
                System.out.println();
                System.out.printf("%3d", 2 * 2);
                System.out.print("  " +  symbol);
                System.out.println();

            }

            System.out.println();

        }

    }

}