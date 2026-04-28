// Lab 2 task 7 
class CellPhone {
    public String model;
    public String[] contacts;
    public int contactCount;

    // Constructor to set default values
    public CellPhone() {
        this.model = "unknown";
        this.contacts = new String[3]; // An array to hold a maximum of 3 contacts
        this.contactCount = 0;
    }

    // Method to store a new contact
    public void storeContact(String contact) {
        if (this.contactCount < 3) {
            this.contacts[this.contactCount] = contact;
            this.contactCount++;
            System.out.println("Contact Stored");
        } else {
            System.out.println("Memory full. New contact can't be stored.");
        }
    }

    // Method to print the phone details and stored contacts
    public void printDetails() {
        System.out.println("Phone Model " + this.model);
        System.out.println("Contacts Stored " + this.contactCount);
        
        if (this.contactCount > 0) {
            System.out.println("Stored Contacts:");
            for (int i = 0; i < this.contactCount; i++) {
                System.out.println(this.contacts[i]);
            }
        }
    }
}

// The Tester class provided in the image
public class Tester9 {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        phone1.printDetails();
        phone1.model = "Nokia 1100";
        System.out.println("1#####################");
        
        phone1.storeContact("Joy - 01834");
        System.out.println("======================");
        phone1.printDetails();
        System.out.println("2#####################");
        
        phone1.storeContact("Toya - 01334");
        phone1.storeContact("Aayan - 01135");
        System.out.println("======================");
        phone1.printDetails();
        System.out.println("3#####################");
        
        phone1.storeContact("Sani - 01441");
        System.out.println("======================");
        phone1.printDetails();
    }
}