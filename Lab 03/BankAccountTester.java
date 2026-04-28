// Lab 03 task 01
class BankAccount {
    // Instance variables
    private int accountNo;
    private String type;

    // Default constructor
    public BankAccount() {
        this.accountNo = 0;
        this.type = "Not Set";
    }

    // Method to return account details as a formatted string
    public String printDetails() {
        return "Account No: " + accountNo + "\nType: " + type;
    }

    // Method to update account information and print a confirmation message
    public void setInfo(int accountNo, String type) {
        this.accountNo = accountNo;
        this.type = type;
        System.out.println("Account information updated!");
    }
}

// The provided Driver Class to test your code
public class BankAccountTester {
    public static void main(String args[]) {
        BankAccount acc1 = new BankAccount();
        System.out.println(acc1.printDetails());
        System.out.println("-----1-----");
        
        acc1.setInfo(1456890, "Salary");
        System.out.println("-----2-----");
        System.out.println(acc1.printDetails());
        System.out.println("-----3-----");
        
        BankAccount acc2 = new BankAccount();
        acc2.setInfo(1765498, "Student");
        System.out.println("-----4-----");
        System.out.println(acc2.printDetails());
    }
}