package xRep.classwork.abstracts.variant18;

import java.util.List;

public class TaxService {

    private List<Factory> clients;

    public double calculateSummaryTax() {
        double sum = 0;
        for (Factory client : clients) {
            sum += client.calculateTaxPayment();
        }
        return sum;
    }
}
