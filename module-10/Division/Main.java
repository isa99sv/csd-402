package Division;

import java.io.*;
import java.util.*;

/*Colton Stone, March 6, 2026, Module 10.2 Assignment

For this program I will create an abstract Division class with fields for a company's division name and account number,
and an abstract display () method that will be defined in the subclasses.

Next create two subclasses which will includes a field for the country in which the division is located, a field for the language spoken,
and a constructor that requires all fields when created.

Then make a class which includes a field for the state in which the division is located and a constructor that requires all fields when created.*/


public class Main {

    public static void main(String[] args) {

   UseDivision ud = new UseDivision();
   ud.display();
    }

}



