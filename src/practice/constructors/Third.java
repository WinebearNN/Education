package practice.constructors;

public class Third {
    int id;
    String name;

    Third(int i, String n) {
        name = n;
        id = i;
    }

    Third(Third s) {
        name = s.name;
        id = s.id;
    }

    public static void main(String[] args) {
        Third Student = new Third(17, "kat");
        Third Student1 = new Third(Student);
        System.out.println(Student1.id + " "  + Student1.name);
    }
}
