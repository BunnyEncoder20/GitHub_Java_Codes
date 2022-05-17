import java.util.Scanner;
import java.lang.Math;

class account {
    protected String acc_name;
    protected double acc_no;
    protected double bal;
    protected int acc_type;

    // public account(String name, double num, double balance1, double balance2, int
    // type) {
    // this.acc_name = name;
    // this.acc_no = num;
    // this.saving_bal = balance1;
    // this.current_bal = balance2;
    // this.acc_type = type;
    // }

    public void setdata(String name, double no, double balance, int type) {
        acc_name = name;
        acc_no = no;
        bal = balance;
        acc_type = type;
    }

}

class cur_acct extends account {

    public void deposit(double amt) {
        bal = bal + amt;
        System.out.println(bal);
    }

    public void withdraw(double amt) {
        bal = bal - amt;
        System.out.println(bal);
    }

    public void check(double amt) {
        if (amt < 100000) {
            bal = bal - 500; //fee
            System.out.println("Insufficient Balance" + bal);
        }
    }
}

class sav_acct extends account {

    public void deposit(double amt) {
        this.bal = bal + amt;
        System.out.println("The new balamce : " + bal);
    }

    public void withdraw(double amt) {
        this.bal = bal - amt;
        System.out.println("The new balance : " + bal);
    }

    public void compound_interest(int time, int freq) {
        double interest = bal * (1 + 10 / freq); // 10% interest rate and
        interest = Math.pow(interest, (time * freq));
        System.out.println("Intertest = " + interest);
        bal = bal + interest;
        System.out.println("The new balance : " + bal);
    }
}

class bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 1;

        while (temp == 1) {
            double amt = 0;
            System.out.println("Name : ");
            String name = in.nextLine();
            System.out.println("\nEnter acc_no");
            double no = in.nextDouble();
            System.out.println("Enter acc_type\n1. Savings\n2. Current");
            int type = in.nextInt();
            do {
                System.out.println("Enter balance");
                amt = in.nextDouble();
            } while (type == 2 && amt < 100000);

            if (type == 1) {
                sav_acct myacc = new sav_acct();
                myacc.setdata(name, no, amt, type);
                System.out.println("\n1.Deposit money\n2.Withdraw cash\n3.Calculate interest");
                int temp2 = in.nextInt();

                if (temp2 == 1) {
                    System.out.println("Enter amoumt to deposit ");
                    double temp_amt = in.nextDouble();
                    myacc.deposit(temp_amt);
                } else if (temp2 == 2) {
                    System.out.println("Enter amoumt to withdraw ");
                    double temp_amt = in.nextDouble();
                    myacc.withdraw(temp_amt);
                } else if (temp2 == 3) {
                    System.out.println("Enter time period ");
                    int time = in.nextInt();
                    System.out.println("Enter frequence per annum ");
                    int freq = in.nextInt();
                    myacc.compound_interest(time, freq);
                }

            }

            else if (type == 2) {
                cur_acct myacc = new cur_acct();
                myacc.setdata(name, no, amt, type);

                System.out.println("\n1.Deposit\n\2.Withdraw");
                int temp3 = in.nextInt();

                if (temp3 == 1) {
                    System.out.println("Enter amoumt to deposit");
                    double amt1 = in.nextDouble();
                    myacc.deposit(amt1);
                } else if (temp3 == 2) {    
                    System.out.println("Enter amoumt to withdraw");
                    double amt1 = in.nextDouble();
                    myacc.check(amt1);
                    myacc.withdraw(amt1);
                }
            }

            System.out.println("To continue enter 1 \nelse 0 to exit");
            temp = in.nextInt();
        }
        in.close();
    }
}