package xRep.homework;




import java.util.InputMismatchException;
import java.util.Scanner;

public class Month {
    private String[] months = {"январь", "февраль", "март", "апрель", "май",
            "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
    private int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public String[] getMonths() {
        return months;
    }

    public int[] getDom() {
        return dom;
    }

    public Month() {

    }

    public static void main(String[] args) {
        int number = 0;
        try {
            Scanner scanner=new Scanner(System.in);
            number=scanner.nextInt()-1;
            Month temp=new Month();
            System.out.println(temp.getDom()[number]);
            System.out.println(temp.getMonths()[number]);
        }catch (ArrayIndexOutOfBoundsException | InputMismatchException ex){
            System.out.println(ex.getMessage()+" недопустимое число " + number);
        }
        System.out.println(number);
    }
}
