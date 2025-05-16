public class Bank {
    private String name;
    private String address;
    private int accNumber;
    private float balance;

    private static int lastGeneratedAccNumber = 1000;
    
    // Constructor
    Bank(String Name, String add) {
        name = Name;
        address = add;
        accNumber = GenerateAccNumber(); // initial account number
        balance = 0;
    }

    // Method to generate account number
    int GenerateAccNumber() {
        lastGeneratedAccNumber++;
        return (accNumber=lastGeneratedAccNumber);
    }

    // Display account information
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance Amount: " + balance);
    }

    // Deposit amount
    void deposit(float amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount to be deposited");
            return;
        }
        balance += amount;
        System.out.println(amount + " amount deposited successfully");
    }

    // Withdraw amount
    void withdraw(float amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount to be withdrawn");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient amount to withdraw");
        } else {
            balance -= amount;
            System.out.println(amount + " amount withdrawn successfully.\n Available balance is " + balance);
        }
    }

    // Change address
    void ChangeAddress(String newAddress) {
        if (newAddress.isEmpty()) { // Check if the address is an empty string
            System.out.println("Invalid address. Empty string.");
            return;
        }
        address = newAddress;
        System.out.println("Address changed successfully");
    }
    public static void main(String[] args) {
        // Create an array of Bank objects
        Bank[] bn = new Bank[4];

        // Initialize Bank objects
        bn[0] = new Bank("John Doe", "123 Elm Street");
        bn[1] = new Bank("Jane Smith", "456 Oak Avenue");
        bn[2] = new Bank("Jim Beam", "789 Pine Road");
        bn[3] = new Bank("Jake Long", "101 Maple Lane");

        // Display account details for all customers
        for (int i = 0; i < bn.length; i++) {
            bn[i].display();
            System.out.println(); // Add a newline for better separation between accounts
        }

        // Example of deposits and withdrawals
        bn[0].deposit(500);
        bn[1].withdraw(200);

        // Change the address of the first bank account
        bn[0].ChangeAddress("202 Birch Drive");

        // Display updated account details
        System.out.println("Updated Account Details:");
        bn[0].display();
    }
}
