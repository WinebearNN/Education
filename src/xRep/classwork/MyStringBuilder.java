package xRep.classwork;

public class MyStringBuilder {
    private String s;
    public MyStringBuilder(String s){
        this.s=s;
    }
    @Override
    public String toString() {
        return  this.s ;
    }

    public MyStringBuilder append(MyStringBuilder msb){
       MyStringBuilder mbs1 = new MyStringBuilder(this.s+msb.s);
       return mbs1;
    }
    public MyStringBuilder append(int i){
        MyStringBuilder msb1 = new MyStringBuilder(this.s+i);
        return msb1;
    }
    public int length(){
        return this.s.length();
    }
    public char charAt(int index){
        return this.s.charAt(index);
    }
    public MyStringBuilder toLowerCase(){
        return new MyStringBuilder(this.s.toLowerCase());
    }
    public MyStringBuilder substring(int begin,int end){
        return new MyStringBuilder(this.s.substring(begin,end));
    }


}
class TestMyStringBuilder{
    public static void main(String[] args) {
        MyStringBuilder msb = new MyStringBuilder("qwfqQQQQQQQQQQQQfwqfq");
        MyStringBuilder msb1 = new MyStringBuilder("sefsfsf");
        System.out.println(msb.append(msb1));
        System.out.println(msb.append(1));
        System.out.println(msb.length());
        System.out.println(msb.charAt(3));
        System.out.println(msb.toLowerCase());
        System.out.println(msb.substring(0,2));
    }
}