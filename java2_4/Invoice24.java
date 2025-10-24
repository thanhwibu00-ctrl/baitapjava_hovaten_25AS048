public class Invoice24 {
    private int id;
    private Customer24 customer;
    private double amount;
    public Invoice24(int id, Customer24 customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public Customer24 getCustomer() {
        return customer;
    }
    public void setCustomer(Customer24 customer) {
        this.customer = customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return customer.getId();
    }
     public String getCustomerName() {
        return customer.getName();
     }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
        return amount * (1 - customer.getDiscount() / 100.0);
    }
    public String toString() {
        return "Invoice [customerId=" + customer + ", amount=" + amount + "]";

    }
}

