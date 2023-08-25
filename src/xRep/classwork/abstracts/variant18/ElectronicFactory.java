package xRep.classwork.abstracts.variant18;

public class ElectronicFactory extends Factory {

    private Priority priority;

    @Override
    public double calculateTaxPayment() {
        return super.calculateTaxPayment() * (1 - priority.getCashback());
    }
}
