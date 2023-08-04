package xRep.classwork;

import java.util.Date;

public class MyTime {
    private long hour;
    private long minute;
    private long second;

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public MyTime(){
        long temp=0;
        temp = new Date().getTime();
        this.hour=(temp/3_600_000);
        temp-=this.hour*3_600_000;
        this.minute=(temp/60_000);
        temp-=this.minute*60_000;
        this.second=(temp/1000);
        temp-=this.minute*1000;
    }
    public MyTime(long time){
        long tempVar= time/3_600_000;
        this.hour=tempVar;
        time-=tempVar*3_600_000;
        tempVar = time/60_000;
        this.minute=tempVar;
        time-=tempVar*60_000;
        this.second=time/1000;
        /*там хоть и написано, что будет возвращать время с 00:00 1 января и тд, но раз отчет с 00, то можно оперативно забить хуй, так как дату нам
        возвращать не надо.Другими словами опираться на 01.01.1970 00:00 нет никакого смысла.
         */
    }
    public MyTime(long tempHour,long tempMinute,long tempSecond){
        this.second=tempSecond;
        this.minute=tempMinute;
        this.hour=tempHour;
    }
    public void setTime(long elapseTime){
        long tempVar= elapseTime/3_600_000;
        this.hour+=tempVar;
        elapseTime-=tempVar*3_600_000;
        tempVar = elapseTime/60_000;
        this.minute+=tempVar;
        elapseTime-=tempVar*60_000;
        this.second+=elapseTime/1000;

    }

    @Override
    public String toString() {
        return
                "часы:" + hour +
                ", минуты:" + minute +
                ", секунды:" + second;
    }
}
class TestMyTime{
    public static void main(String[] args) {
        MyTime test1 =new MyTime();
        System.out.println(test1.toString());
        MyTime test2=new MyTime(555_550_000);
        System.out.println(test2.toString());
        MyTime test3=new MyTime(5,23,55);
        System.out.println(test3.toString());


    }
}
