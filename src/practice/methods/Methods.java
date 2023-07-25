package practice.methods;

public class Methods {

    String name;
    int age;

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public void jump() {
        System.out.println("Прыг-скок!");
    }

    public static void main(String[] args) {
        Methods barsik = new Methods();
        barsik.age = 3;
        barsik.name = "Барсик";

        barsik.sayMeow();
        barsik.jump();
    }
}
