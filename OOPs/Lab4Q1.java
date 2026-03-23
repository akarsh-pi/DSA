import java.util.*;
class Bank{
    Scanner sc = new Scanner(System.in);
    String name;
    int accNo;
    String accType;
    Double balance;
    static Double ROI;
    
    Bank(){
        name = "Unknown";
        accNo = 0000000;
        accType = "NA";
        balance = 0.0;
        ROI = 0.0;
    }

    Bank(String name, int accNo, String accType, Double balance, Double ROI){
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
        this.ROI = ROI;
    }

    void deposit(){
        System.out.print("Enter deposit ammount: ");
        Double deposit = sc.nextDouble();
        this.balance += deposit;
        System.out.println("Ammount deposited.");
        System.out.println("Balance = " + this.balance);
    }

    void withraw(){
        System.out.println("Balance = " + this.balance);
        System.out.print("Enter withdrawl Ammount: ");
        Double withdraw = sc.nextDouble();
        if(this.balance < withdraw){
            System.out.println("Withdrawl ammount exceeds the Ammount you have DUMB FUCK!!");
        }
        else{
            System.out.println("Ammount withdrewed");
            this.balance-=withdraw;
            System.out.println("Balance Remaining = " + this.balance);
        }
    }
    
    void display(){
        System.out.println("Name of the depositor: " + name);
        System.out.println("Account number: " + accNo);
        System.out.println("Type of Account: " + accType);
        System.out.println("Balance Ammount in the Account: " + balance);
    }

    void disROI(){
        System.out.println("Rate of Interest: " + ROI);
    }
}

public class Lab4Q1 {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank("Akarsh", 1234, "Saving", 20000.0, 2.0);
        b1.deposit();
        b1.withraw();
        b1.display();
        b1.disROI();
        b2.deposit();
        b2.withraw();
        b2.display();
        b2.disROI();
    }
}
