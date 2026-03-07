package Division;

public class DomesticDivision extends Division {

        String location_State;

        DomesticDivision(String company_Name, int company_Account, String location_State) {
            super(company_Name, company_Account);
            this.location_State = location_State;
        }

        @Override
        public void display() {
            System.out.println("\nThe company " + company_Name + " has an account number of " +
                    "(" + company_Account + ")" + " and is located in " + location_State + ".");
        }

    }
