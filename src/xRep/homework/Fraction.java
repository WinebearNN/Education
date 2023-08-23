package xRep.homework;

public class Fraction {
    final int numerator=0;
    final int denominator=0;
    private double fraction;

    public double getFraction() {
        return fraction;
    }

    public Fraction(int numerator, int denominator) throws NullDenominatorException {
        try {
            this.fraction = numerator / denominator;
        }catch (ArithmeticException ex){
            throw new NullDenominatorException("idi nahyi");
        }
    }
}
class tester{
    public static void main(String[] args) throws NullDenominatorException {
        Fraction fraction=new Fraction(50,0);
        System.out.println(fraction.getFraction());
    }
}