package xRep.classwork;

public class MyInteger {

    private int value;
    public int getValue() {
        return value;
    }
    public MyInteger() {

    }
    public boolean isEven(){
        if (this.value%2==0){
            return true;
        }
        return false;
    }
    public boolean isOdd(){
        if (this.value%2!=0){
            return true;
        }
        return false;
    }
   // public boolean isPrime(){

    //}
}
