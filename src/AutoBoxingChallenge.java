/* You job is to create a simple banking application.
There should be a Bank class

It should have an arraylist of Branches

Each Branch should have an arraylist of Customers

The Customer class should have an arraylist of Doubles (transactions)

Customer:
Name, and the ArrayList of doubles.

Branch:
Need to be able to add a new customer and initial transaction amount.
Also needs to add additional transactions for that customer/branch

Bank:
Add a new branch
Add a customer to that branch with initial transaction
Add a transaction for an existing customer for that branch

Show a list of customers for a particular branch and optionally a list
of their transactions

Demonstration autoboxing and unboxing in your code
Hint: Transactions
Add data validation.
e.g. check if exists, or does not exist, etc.
Think about where you are adding the code to perform certain actions

 */

import java.util.*;

public class AutoBoxingChallenge {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addBranch(new Branch());
        bank.addCustomer(0, new Customer("Vadzim", 1000));
        bank.addCustomer(0, new Customer("Vadzim", 1000));
        bank.addCustomer(0, new Customer("Other"));
        bank.addTransaction(0, "Vadzim", 50);
        bank.showListOfCustomers(0);
    }
}

class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();
    }

    public void addBranch(Branch b) {
        branches.add(b);
    }

    public void addCustomer(int branch, Customer c) {
        branches.get(branch).addCustomer(c);
    }

    public void addTransaction(int branch, String customerName, double amount) {
        branches.get(branch).addTransaction(customerName, amount);
    }

    public void showListOfCustomers(int branch) {
        System.out.println("Branch " + branch + " cusomer list: ");
        branches.get(branch).printCustomers();
        System.out.println("end list.");
    }


}

class Branch {
    private ArrayList<Customer> customers;

    public Branch() {
        this.customers = new ArrayList<Customer>();
    }

    public void addCustomer(Customer c) {
        if (find(c.getName()) >= 0) {
            System.out.println("Can't add - " + c.getName() + " already exists: " + c.toString());
        } else {
            this.customers.add(c);
            System.out.println("Customer added: " + c.toString());
        }
    }

    public void addTransaction(String customerName, double amount) {
        if (find(customerName) >= 0) {
            this.customers.get(find(customerName)).addTransactionAmount(amount);
            System.out.println("amount " + amount + " added to " + customerName);
        } else {
            System.out.println("Customer with name " + customerName + " not found");
        }


    }

    public int find(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equalsIgnoreCase(customerName)) {
                return i;
            }
        }
        return -1;
    }

    public void printCustomers() {

        for (Customer c : customers) {
            System.out.println(c.toString());
        }
    }

}

class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double amount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(amount);
    }

    public Customer(String name) {
        this(name, 0);
    }

    public void addTransactionAmount(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}

