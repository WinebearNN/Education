package xRep.homework;

public class Variant18 {
}

class Entity {
    public Entity() {

    }
}

class Factory {
    private String name;
    private int yearOfFoundation;

    public String getName() {
        return name;
    }


    public int getYearOfFoundation() {
        return yearOfFoundation;
    }


    private Entity[] countOfEntities;

    public Factory() {

    }

    public Factory(int yearOfFoundation, Entity[] entities, String name) {
        this.yearOfFoundation = yearOfFoundation;
        this.countOfEntities = entities;
        this.name = name;
    }

    public Factory(int yearOfFoundation, String name) {
        this.yearOfFoundation = yearOfFoundation;
        this.name = name;
    }
}

class Product {
    private int countOfProducts;
    private int costOfProducts;
    private double tax;

    public int getCountOfProducts() {
        return countOfProducts;
    }

    public int getCostOfProducts() {
        return costOfProducts;
    }

    public double getTax() {
        return tax;
    }
}

class Service {
    private int countOfServices;
    private final int serviceTax = 12;
    private int costOfServices;

    public int getCountOfServices() {
        return countOfServices;
    }

    public int getServiceTax() {
        return serviceTax;
    }

    public int getCostOfServices() {
        return costOfServices;
    }
}

class CarsFactory extends Factory {
    private Factory[] infoAboutSuppliers;
    private Product[] products;
    private Service[] services;

    // что до этого, тут метод должен проходиться по твоему массиву,
    // про который я тебе сказал выше, и считать это все динамически
    public double calculateSalaryProducts() {
        double allSum = 0;
        for (Product i : this.products) {
            allSum += i.getCostOfProducts();
        }
        return allSum;
    }

    public double calculateSalaryService() {
        double allSum = 0;
        for (Service i : services) {
            allSum += i.getCostOfServices();
        }
        return allSum;
    }

    public Factory[] getInfoAboutSuppliers() {
        return infoAboutSuppliers;
    }

    public double calculateSalaryWithoutTax() {
        double sumOfTax = 0;
        for (Product i : this.products) {
            TaxOffice temp = new TaxOffice(i);
            sumOfTax += i.getCostOfProducts() * temp.calculateTaxForCarFactory();
        }
        for (Service i : this.services) {
            sumOfTax += i.getServiceTax() * i.getCostOfServices();
        }
        return sumOfTax;
    }

    public CarsFactory(Factory[] factories, int yearOfFoundation, String name, Service[] services, Product[] products) {
        super(yearOfFoundation, name);
        this.infoAboutSuppliers = factories;
        this.services = services;
        this.products = products;
    }
}

class MicroElectronicFactory extends Factory {
    private String significance;

    private Product[] products;


    public String getSignificance() {
        return significance;
    }

    public MicroElectronicFactory(int yearOfFoundation, String name, Product[] products, String significance) {
        super(yearOfFoundation, name);
        this.products = products;
        this.significance = significance;
    }

    public int calculateBenefit() {
        switch (significance) {
            case "high":
                return 35;
            case "medium":
                return 15;
        }
        return 0;

    }

    public double calculateSalaryProducts() {
        double allSum = 0;
        for (Product i : this.products) {
            allSum += i.getCostOfProducts();
        }
        return allSum;
    }

    public double calculateBenefitSum() {
        double sumOfBen = 0;
        for (Product i : this.products) {
            sumOfBen += i.getTax() * i.getCostOfProducts() * this.calculateBenefit();
        }
        return sumOfBen / 100;
    }

    public double calculateSalaryWithoutTax() {
        double sumOfTax = 0;
        for (Product i : this.products) {
            TaxOffice temp = new TaxOffice(i);
            sumOfTax += i.getCostOfProducts() * temp.calculateTaxForMicroFactory();
        }
        return sumOfTax - this.calculateBenefitSum();
    }
}

class InsuranceCompany {
    private Factory[] factories;
    private int sumOfAwards;
    private int sumOfPayments;
    private int countOfClients;

    public Factory[] getFactory() {
        return factories;
    }

    public int getSumOfAwards() {
        return sumOfAwards;
    }

    public int getSumOfPayments() {
        return sumOfPayments;
    }

    public int getCountOfClients() {
        return countOfClients;
    }

    public InsuranceCompany(Factory[] factories, int sumOfAwards, int sumOfPayments, int countOfClients) {
        this.factories = factories;
        this.sumOfAwards = sumOfAwards;
        this.sumOfPayments = sumOfPayments;
        this.countOfClients = countOfClients;
    }


}

class TaxOffice {
    private CarsFactory cf;
    private MicroElectronicFactory mf;
    private InsuranceCompany ic;
    private String name;
    private int yearOfFoundation;
    private Product product;

    public CarsFactory getCf() {
        return cf;
    }

    public MicroElectronicFactory getMf() {
        return mf;
    }

    public InsuranceCompany getIc() {
        return ic;
    }

    public String getName() {
        return name;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public TaxOffice(CarsFactory cf, Product product) {
        this.product = product;
    }

    public TaxOffice(Product product) {
        this.product = product;
    }

    public TaxOffice(InsuranceCompany ic) {
        this.ic = ic;
    }

    public double calculateTaxForCarFactory() {
        return this.product.getCostOfProducts() * this.product.getTax() / 100;
    }

    public double calculateTaxForMicroFactory() {
        return this.product.getTax() * this.product.getCostOfProducts() / 100;
    }

    public double calculateTaxForUsFactories() {
        if (this.ic.getCountOfClients() >= 100) {
            if (this.ic.getSumOfPayments() == 0) {
                return this.ic.getSumOfAwards() * 0.1;
            } else {
                return 0;
            }
        } else {
            if (this.ic.getSumOfPayments() == 0) {
                return this.ic.getSumOfAwards() * 0.25;
            } else {
                return 0;
            }
        }
    }


}