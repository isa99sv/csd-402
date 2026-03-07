package Division;

public abstract class Division {

        String company_Name;
        int company_Account;

        Division(String company_Name, int company_Account) {
            this.company_Name = company_Name;
            this.company_Account = company_Account;
        }

    public Division() {

    }

    abstract void display();
    }
