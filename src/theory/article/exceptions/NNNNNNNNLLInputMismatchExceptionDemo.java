package theory.article.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NNNNNNNNLLInputMismatchExceptionDemo {

}
final class pp {
    public static void main(String[] args) {
        boolean continueIn = true;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                int number = scanner.nextInt();
                System.out.println(number / 10);
                continueIn = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again");
                scanner.nextLine();
            }
        } while (continueIn);

    }
}
