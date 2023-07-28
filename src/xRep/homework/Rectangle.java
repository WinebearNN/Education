package xRep.homework;

public class Rectangle {

    double width = -1;

    double height = -1;

    // Конструкторы не имеют возвращаемый тип, даже по серому это видно
    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    // Вот тут ошибка с тем, что поля то достаются из объекта, на котором метод вызывается
    // И тут уже не статик, так как нужно это возвращать для объекта, на котором этот метод вызывается
    public double getArea() {
        return this.width * this.height;
    }

    // Те же самые моменты
    public double getPerimeter() {
        return (this.width*2 + this.height*2);
    }

    public static void main(String[] args) {
        Rectangle fir = new Rectangle();
        fir.width = 3.5;
        fir.height = 35.9;
        System.out.println(fir.width);
        System.out.println(fir.height);
        System.out.println(fir.getPerimeter());
        System.out.println(fir.getArea());
    }
}

class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,40);
        Rectangle rectangle1 = new Rectangle(3.5,35.9);


    }

}