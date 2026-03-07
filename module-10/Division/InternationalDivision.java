package Division;

public class InternationalDivision extends Division {

        String location_Country;
        String language;

        InternationalDivision(String company_Name, int company_Account, String location_Country, String language) {
            super(company_Name, company_Account);
            this.location_Country = location_Country;
            this.language = language;
        }

        @Override
        public void display() {
            System.out.println("\nThe company " + company_Name + " has an account number of " + "(" + company_Account + ")" +
                    " and is located in " + location_Country + " where the official spoken language is " + language + ".");
        }
    }
