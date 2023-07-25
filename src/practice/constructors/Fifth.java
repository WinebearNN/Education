package practice.constructors;

public class Fifth {
    public static void main(String[] args) {
        Fifth object = new Fifth("sgfsdhjf");
        System.out.println(object.name);
    }


    private String name;

    private String surname;

    private String goodluck;

    public Fifth(String name, String surname,String goodluck ) {
        this.name = name;
        this.surname = surname;
        this.goodluck = goodluck;

    }
    public Fifth(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGoodluck() {
        return goodluck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGoodluck(String goodluck) {
        this.goodluck = goodluck;
    }
}
