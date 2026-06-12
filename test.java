class Bank {
    String accountholder;
    String accounttype;
    double Balance;
    int deposit;
    int withdraw;

    void display() {
        System.out.println("After depositing: " + (deposit + Balance));
        this.Balance = (deposit + Balance);

    }

    void display1() {
        if (Balance >= withdraw) {
            this.Balance = (Balance - withdraw);
        }
        // System.out.println("available Balance: " + Balance);
    }
}

public class test {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.accountholder = "Neeraj";
        b1.accounttype = "Saving";
        b1.Balance = 15000;
        b1.deposit = 5000;
        b1.withdraw = 7000;
        b1.display();
        b1.display1();

        System.out.println("Name: " + b1.accountholder);
        System.out.println("account type: " + b1.accounttype);
        System.out.println("After Balance: " + b1.Balance);
    }
}
