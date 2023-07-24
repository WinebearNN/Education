package theory.youtube;
public class ArraysOfStrings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Farewell";
        strings[2] = "Jarvis";
        for (String string : strings) {
            System.out.println(string);
        }
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int temp_value : numbers1) {
            sum += temp_value;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s = null;


    }
}
