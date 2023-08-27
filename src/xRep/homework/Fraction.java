package xRep.homework;

public class Fraction {
    final int numerator;
    final int denominator;
    private double fraction;

    public double getFraction() {
        return fraction;
    }

    public Fraction(int numerator, int denominator) throws NullDenominatorException {
        this.numerator=numerator;
        if (denominator==0){
            throw new NullDenominatorException("Idi nahyi");
        }else{
            this.denominator=denominator;
        }
    }
    public double fraction(){
        return numerator/(denominator+0.0);
    }
}

class Tester {
    public static void main(String[] args) throws NullDenominatorException {
        Fraction fraction = new Fraction(50, 0);
        System.out.println(fraction.getFraction());
    }
}