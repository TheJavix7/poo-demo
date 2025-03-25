package ejercicioHerenciaCustomer;

public class Account {

    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = customer.getId();
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = customer.getId();
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customer.getName();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        this.balance -= amount;
        return this;
    }

    @Override
    public String toString() {
        return "\"" + customer.getName() + "(" + id + ") balance=$" + String.format("%.2f" , balance) + "\n";
    }
}
