package practice.constructors;

public class Fourth {
    int id;
    String name;

    Fourth(int i, String n) {
        id = i;
        name = n;
    }

    Fourth() {
    }

    public static void main(String[] args) {
        Fourth s1 = new Fourth(111, "jj");
        Fourth s2 = new Fourth();
        System.out.println(s2.id + " " + s2.name);
        s2.id=s1.id;
        s2.name=s1.name;
        System.out.println(s2.id + " " + s2.name);
    }
}
