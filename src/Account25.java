public class Account25 {
    private int id;
    private Customer25 customer;
    private double balance = 0.0 ;
    public Account25(int id, Customer25 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public Customer25 getCustomer() {
        return customer;
    }
    public double getbalance() {
        return balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return "Account02 [id=" + id + ", customer=" + customer + ", balance=" + balance + "]";
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public Account25 deposit(double amount){
        balance += amount;
        return this;
    }
    public Account25 withdraw(double amount){
        balance -= amount;
        return this;
    }
}
