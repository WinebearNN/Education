package theory.youtube;

public class Arrayss {
    public static void main(String[] args) {
        int number = 10;//primitive type of data
        char character = 'a';//primitive type of data       [10]
        String s = " Hello";//link-type
        String s1 = new String("Hello");//link-type
        int[] numbers = new int[5];//numbers -[array] link type of data
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println();
        int[] numbers1 = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}
