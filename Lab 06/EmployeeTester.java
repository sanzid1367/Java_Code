// Lab_06 Task 06

class Employee {
    public String name;
    private double baseSalary;
    private int hoursWorked;

    public Employee(String name, double baseSalary, int hoursWorked) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Work Hours: " + hoursWorked);
    }
}

// Write the Manager class here
class Manager extends Employee {
    private double bonusPercentage;
    private double finalSalary;

    public Manager(String name, double baseSalary, int hoursWorked, double bonusPercentage) {
        super(name, baseSalary, hoursWorked);
        this.bonusPercentage = bonusPercentage;
    }

    public void calculateSalary() {
        if (getHoursWorked() > 40) {
            finalSalary = getBaseSalary() + (getBaseSalary() * (bonusPercentage / 100.0));
        } else {
            finalSalary = getBaseSalary();
        }
    }

    public void requestIncrement(int amount) {
        if (getHoursWorked() > 100) {
            setBaseSalary(getBaseSalary() + amount);
            System.out.println("$" + amount + " Increment approved.");
        } else if (getHoursWorked() > 80) {
            setBaseSalary(getBaseSalary() + (amount / 2));
            System.out.println("$" + (amount / 2) + " Increment approved.");
        } else {
            System.out.println("Increment denied.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: " + bonusPercentage + " %");
        System.out.println("Final Salary: $" + finalSalary);
    }
}

// Write the Developer class here
class Developer extends Employee {
    private String language;
    private double finalSalary;

    public Developer(String name, double baseSalary, int hoursWorked, String language) {
        super(name, baseSalary, hoursWorked);
        this.language = language;
    }

    public void calculateSalary() {
        if (language.equals("Java")) {
            finalSalary = getBaseSalary() + 700.0;
        } else {
            finalSalary = getBaseSalary();
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Language: " + language);
        System.out.println("Final Salary: $" + finalSalary);
    }
}

// Tester Class
public class EmployeeTester {
    public static void main(String[] args) {
        Manager neymar = new Manager("Neymar", 1000, 45, 10);
        Developer messi = new Developer("Messi", 1000, 50, "Java");
        Developer chiesa = new Developer("Chiesa", 1000, 50, "Javascript");
        
        neymar.calculateSalary();
        System.out.println("1.==========");
        neymar.displayInfo();
        System.out.println("2.==========");
        neymar.requestIncrement(100);
        System.out.println("3.==========");
        neymar.setHoursWorked(85);
        neymar.requestIncrement(100);
        System.out.println("4.==========");
        neymar.calculateSalary();
        System.out.println("5.==========");
        neymar.displayInfo();
        System.out.println("6.==========");
        messi.calculateSalary();
        System.out.println("7.==========");
        messi.displayInfo();
        System.out.println("8.==========");
        chiesa.calculateSalary();
        System.out.println("9.==========");
        chiesa.displayInfo();
    }
}