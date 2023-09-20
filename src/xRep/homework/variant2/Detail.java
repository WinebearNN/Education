package xRep.homework.variant2;

public class Detail {

    private double productionRateNormal;
    private double productionRateFact;
    private double kef;

    public Detail(double productionRateNormal, double productionRateFact) {
        this.productionRateNormal = productionRateNormal;
        this.productionRateFact = productionRateFact;
    }

    public double getProductionRateNormal() {
        return productionRateNormal;
    }

    public void setProductionRateNormal(double productionRateNormal) {
        this.productionRateNormal = productionRateNormal;
    }

    public double getProductionRateFact() {
        return productionRateFact;
    }

    public void setProductionRateFact(double productionRateFact) {
        this.productionRateFact = productionRateFact;
    }

    public double getKef() {
        return productionRateFact / productionRateNormal;
    }

    public void setKef(double kef) {
        this.kef = kef;
    }
}
