package xRep.homework;

public class Rectangle {

    double width = -1;

    double height = -1;

    // Конструкторы не имеют возвращаемый тип, даже по серому это видно
    private void Rectangle() {

    }

    private void Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    // Вот тут ошибка с тем, что поля то достаются из объекта, на котором метод вызывается
    // И тут уже не статик, так как нужно это возвращать для объекта, на котором этот метод вызывается
    private static double getArea(double width1, double height1) {
        return (width1 * height1);
//        return this.width * this.height;
    }

    // Те же самые моменты
    private static double getPerimeter(double height1, double width1) {
        return (2 * width1 + 2 * height1);
    }

    public static void main(String[] args) {
        Rectangle fir = new Rectangle();
        fir.width = 3.5;
        fir.height = 35.9;
        System.out.println(fir.width);
        System.out.println(fir.height);
        System.out.println(getArea(fir.width, fir.height));
        System.out.println(getPerimeter(fir.height, fir.width));
    }
}
