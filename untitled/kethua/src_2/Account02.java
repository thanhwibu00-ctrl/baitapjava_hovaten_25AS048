public class Account02 {
    private int id;
    private  Customer customer;
    private double balance = 0.0 ;
    public Account02(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
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
    public Account02 deposit(double amount){
        balance += amount;
        return this;
    }
    public Account02 withdraw(double amount){
        balance -= amount;
        return this;
    }
}
