package xRep.homework;

import java.util.Arrays;

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

class CarsFactory extends Factory {
    private double tax;
    private int countOfProducts;
    private int costOfProducts;
    private Factory[] InfoAboutSuppliers;

    public double getTax() {
        return tax;
    }

    public int getCostOfServices() {
        return costOfServices;
    }

    public int getCountOfProducts() {
        return countOfProducts;
    }

    public int getCostOfProducts() {
        return costOfProducts;
    }

    public Factory[] getInfoAboutSuppliers() {
        return InfoAboutSuppliers;
    }

    public int getCountOfServices() {
        return countOfServices;
    }

    public int getServiceTax() {
        return serviceTax;
    }

    private int countOfServices;
    private final int serviceTax = 12;
    private int costOfServices;

    public CarsFactory(Factory[] factories, int countOfServices, int yearOfFoundation, String name, int costOfServices) {
        super(yearOfFoundation, name);
        this.InfoAboutSuppliers = factories;
        this.countOfServices = countOfServices;
        this.costOfServices = costOfServices;
    }


}

class MicroElectronicFactory extends Factory {
    private double tax;
    private int countOfProducts;
    private int costOfProducts;
    private String significance;

    public double getTax() {
        return tax;
    }

    public int getCountOfProducts() {
        return countOfProducts;
    }

    public int getCostOfProducts() {
        return costOfProducts;
    }

    public String getSignificance() {
        return significance;
    }

    public MicroElectronicFactory(int yearOfFoundation, String name, double tax, int countOfProducts, int costOfProducts, String significance) {
        super(yearOfFoundation, name);
        this.tax = tax;
        this.countOfProducts = countOfProducts;
        this.costOfProducts = costOfProducts;
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
}

class InsuranceCompany {
    private Factory factory;
    private int sumOfAwards;
    private int sumOfPayments;
    private int countOfClients;

    public Factory getFactory() {
        return factory;
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

    public InsuranceCompany(Factory factory, int sumOfAwards, int sumOfPayments, int countOfClients) {
        this.factory = factory;
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

    public TaxOffice(CarsFactory cf, String name, int yearOfFoundation) {
        this.cf = cf;
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
    }

    public TaxOffice(MicroElectronicFactory mf, String name, int yearOfFoundation) {
        this.mf = mf;
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
    }

    public TaxOffice(InsuranceCompany ic, String name, int yearOfFoundation) {
        this.ic = ic;
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
    }

    public double calculateTaxForCarFactory() {
        return this.cf.getCostOfProducts() * this.cf.getTax() * this.cf.getCountOfProducts() / 100 + this.cf.getCostOfServices() * this.cf.getServiceTax() * this.cf.getCountOfServices() / 100;
    }

    public double calculateTaxForMicroFactory() {
        return (this.mf.getCostOfProducts() * this.mf.getTax() * this.mf.getCountOfProducts() / 100 - this.mf.getCostOfProducts() * this.mf.getTax() * this.mf.getCountOfProducts() * this.mf.calculateBenefit() / 10000);
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

    public double calculateBenefitsMicroElectronicFactory() {
        return this.mf.getCostOfProducts() * this.mf.getTax() * this.mf.getCountOfProducts() * this.mf.calculateBenefit() / 10000;
    }

    public double calculateSalaryCarFac() {
        return this.cf.getCountOfServices() * this.cf.getCostOfServices() + this.cf.getCountOfProducts() * this.cf.getCostOfProducts() - this.calculateTaxForCarFactory();
    }

    public double calculateSalaryElecFac() {
        return this.mf.getCostOfProducts() * this.mf.getCountOfProducts() - this.calculateTaxForMicroFactory() + this.calculateBenefitsMicroElectronicFactory();
    }


}
