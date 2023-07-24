package xRep.homework;

import java.util.Scanner;

public class GCD {
    public static double GreatestCommonDivisor(double a, double b) {
        double minValue = Math.max(a, b);
        double gcd = 0;
        for (int i = 1; i <= (minValue / 2); i++) {
            if ((b % i == 0) && (a % i == 0)) {
                gcd = Math.max(gcd, i);
            } else {
                continue;
            }
        }
        return gcd;

    }

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        double a = c.nextDouble();
        double b = c.nextDouble();
        System.out.println(GreatestCommonDivisor(a, b));
    }
}
