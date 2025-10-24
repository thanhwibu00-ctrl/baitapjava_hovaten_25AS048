package jave2_2;

public class Book22 {
    private String name;
    private Author22[] authors;
    private double price;
    private int qty = 0;
    public Book22(String name, Author22[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book22(String name, Author22[] authors , double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Author22[] getAuthors() {
        return authors;
    }
    public void setAuthor(Author22[] authors) {
        this.authors = authors;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString(){
        return " Book[name=" + name + "," + authors.toString() + price + ", qty=" + qty + "]";
    }
    public String getAuthorName(){
        /*
        * muc dich:
        * can phai co cai gi:
        * for có gì:
        * cách sử dụng:
        * authors.length = 3
        *  i = 2
        *
        *
        * i = 1
        * check
        *
        * i =2
        * check
        *
        *
        * */
        String names = "";

       for (int i =0 ; i < authors.length ; i++){
          Author22 author = authors[i];
          String name = author.getName();
          names += name;
       }

       return names;
    }

}
