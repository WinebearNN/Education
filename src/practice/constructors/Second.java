package practice.constructors;

public class Second {
    int id;
    String name;
    public Second(int i, String n){
        id = i;
        name = n;

    }

    public static void main(String[] args) {
        Second student = new Second(100, "Karen");
        System.out.println(student.id + " " + student.name);

    }



}
