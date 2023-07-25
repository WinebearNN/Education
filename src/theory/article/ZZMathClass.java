package theory.article;

public class ZZMathClass {
    public static void main(String[] args) {


    }
}

class ABS {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1));      // 1
        System.out.println(Math.abs(-21.8d));  // 21.8
        System.out.println(Math.abs(4532L));   // 4532
        System.out.println(Math.abs(5.341f));  // 5.341

    }
}

class Triganometry {
    public static void main(String[] args) {
        //Degrees -> Radians
        System.out.println(Math.sin(Math.toRadians(0)));
        System.out.println(Math.sin(Math.toRadians(30)));
        System.out.println(Math.sin(Math.toRadians(90)));

        System.out.println(Math.cos(Math.toRadians(0)));
        System.out.println(Math.cos(Math.toRadians(30)));
        System.out.println(Math.cos(Math.toRadians(90)));

    }

}

class Exponentiation {
    public static void main(String[] args) {
        System.out.println(Math.pow(1, 2)); // 1.0
        System.out.println(Math.pow(2, 2)); // 4.0
        System.out.println(Math.pow(3, 2)); // 9.0
        System.out.println(Math.pow(4, 2)); // 16.0
        System.out.println(Math.pow(5, 2)); // 25.0

        System.out.println(Math.pow(1, 3)); // 1.0
        System.out.println(Math.pow(2, 3)); // 8.0
        System.out.println(Math.pow(3, 3)); // 27.0
        System.out.println(Math.pow(4, 3)); // 64.0
        System.out.println(Math.pow(5, 3)); // 125.0

    }
}

class SquareCubeRoots {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(4));   // 2.0
        System.out.println(Math.sqrt(9));   // 3.0
        System.out.println(Math.sqrt(16));  // 4.0

        System.out.println(Math.cbrt(8));   // 2.0
        System.out.println(Math.cbrt(27));  // 3.0
        System.out.println(Math.cbrt(125)); // 5.0
    }
}

class RandomGeneration {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Math.random());
        }
//      if I want to change range from Math.random:
        System.out.println((int) (50 + Math.random() * 200));//from 50 to 249(250 doesn't include)
    }
}

class Rounding {
    public static void main(String[] args) {
        System.out.println(Math.round(1.3)); // 1
        System.out.println(Math.round(1.4)); // 1
        System.out.println(Math.round(1.5)); // 2
        System.out.println(Math.round(1.6)); // 2

        System.out.println(Math.floor(1.3)); // 1.0
        System.out.println(Math.floor(1.4)); // 1.0
        System.out.println(Math.floor(1.5)); // 1.0
        System.out.println(Math.floor(1.6)); // 1.0

        System.out.println(Math.ceil(1.3)); // 2.0
        System.out.println(Math.ceil(1.4)); // 2.0
        System.out.println(Math.ceil(1.5)); // 2.0
        System.out.println(Math.ceil(1.6)); // 2.0
    }
}
