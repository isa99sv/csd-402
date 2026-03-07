package Division;

public class UseDivision extends Division {

        UseDivision(String company_Name, int company_Account) {
            super(company_Name, company_Account);
        }

    public UseDivision() {
        super();
    }

    @Override
        public void display() {
           DomesticDivision dd1 = new DomesticDivision("Microsoft",1005,"Washington");
           DomesticDivision dd2 = new DomesticDivision("Disney",3160,"California");

           InternationalDivision id1 = new InternationalDivision("LVMH",7442,"France", "French");
           InternationalDivision id2 = new InternationalDivision("Sony",6558,"Japan", "Japanese");

           dd1.display();
           dd2.display();
           id1.display();
           id2.display();

        }


    }
