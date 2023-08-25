package xRep.classwork.abstracts.variant18;

import java.util.List;

public class Factory {

    protected String name;
    protected List<Product> products;
    protected Long yearOfFoundation;

    public double calculateSalary() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice() * product.getNumber();
        }
        return sum;
    }
    public double calculateTaxPayment() {
        double sum = 0;
        // тут можно вынести расчет налога в Product
        for (Product product: products) {
            sum += product.calculateTax();
        }
        return sum;
    }

}
