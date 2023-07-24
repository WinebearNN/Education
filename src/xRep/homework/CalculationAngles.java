package xRep.homework;

import java.util.Scanner;

public class CalculationAngles {

    public static double CalculateSide(double x1, double x2, double y1, double y2) {
        double side = 0;
        side = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return side;
    }

    public static double CalculateArcCos(double a, double b, double c) {
        double alfa;
        double tempAngle = -((Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2)) / (2 * b * c));
        alfa = Math.acos(tempAngle);
        return Math.toDegrees(alfa);

    }

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        double x1 = v.nextDouble();
        double x2 = v.nextDouble();
        double x3 = v.nextDouble();
        double y1 = v.nextDouble();
        double y2 = v.nextDouble();
        double y3 = v.nextDouble();
        double a = CalculateSide(x1, x2, y1, y2);
        double b = CalculateSide(x1, x3, y1, y3);
        double c = CalculateSide(x2, x3, y2, y3);
        System.out.println(CalculateArcCos(a, b, c));
        System.out.println(CalculateArcCos(b, a, c));
        System.out.println(CalculateArcCos(c, a, b));


    }
}
