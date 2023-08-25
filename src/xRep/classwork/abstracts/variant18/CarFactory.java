package xRep.classwork.abstracts.variant18;

import java.util.List;

public class CarFactory extends Factory {

    private List<Service> services;
    private List<Factory> suppliers;

    public CarFactory(List<Service> services) {
        this.services = services;
    }

    @Override
    public double calculateSalary() {
        double sum = super.calculateSalary();
        for (Service service : services) {
            sum += service.getPrice() * service.getNumber();
        }
        return sum;
    }

    @Override
    public double calculateTaxPayment() {
        double sum = super.calculateTaxPayment();
        for (Service service : services) {
            sum += service.calculateTax();
        }
        return sum;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void addSupplier(Factory factory) {
        suppliers.add(factory);
    }

    public List<Factory> getSuppliers() {
        return suppliers;
    }
}
