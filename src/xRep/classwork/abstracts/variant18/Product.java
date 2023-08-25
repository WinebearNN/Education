package xRep.classwork.abstracts.variant18;

public class Product {

    private double price;
    private int number;
    private double tax;

    public Product(double price, int number, double tax) {
        this.price = price;
        this.number = number;
        this.tax = tax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double calculateTax() {
        return this.tax * this.price * this.number;
    }
}
