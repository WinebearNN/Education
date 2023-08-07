package xRep.homework;

import xRep.classwork.MyStringBuilder;

public class MyStringBuilder2 {
    private String s;

    @Override
    public String toString() {
        return s;
    }

    public MyStringBuilder2() {

    }

    public MyStringBuilder2(char[] chars) {
        String temp = new String(chars);
        this.s = temp;
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        MyStringBuilder2 temp1 = new MyStringBuilder2(this.s.substring(0, (offset)));
        MyStringBuilder2 temp2 = new MyStringBuilder2(this.s.substring(offset - 1));
        MyStringBuilder2 temp3 = new MyStringBuilder2(temp1.s + s + temp2.s);
        return temp3;
    }

    public MyStringBuilder2 reverse() {
        MyStringBuilder msb = new MyStringBuilder("");
        char[] tempAr = new char[this.s.length()];
        for (int i = 0; i < this.s.length(); i++) {
            tempAr[i] = this.s.toCharArray()[this.s.length() - 1 - i];
        }
        MyStringBuilder2 msb2 = new MyStringBuilder2(tempAr);
        return msb2;
    }

    public MyStringBuilder2 substring(int begin) {
        MyStringBuilder2 msb2 = new MyStringBuilder2(this.s.substring(begin));
        return msb2;
    }
    public MyStringBuilder2 toUpperCase(){
        MyStringBuilder2 mbs2=new MyStringBuilder2(this.s.toUpperCase());
        return mbs2;
    }


}

class TestMyStringBuilder2 {
    public static void main(String[] args) {
        char[] chars = {'1', '2', 'a', 'b'};
        MyStringBuilder2 msb = new MyStringBuilder2(chars);
        String j = new String(chars);
        //System.out.println(msb.insert(1,msb));
        System.out.println(msb.reverse());

    }
}