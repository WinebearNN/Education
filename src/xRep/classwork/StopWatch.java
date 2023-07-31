package xRep.classwork;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "StopWatch{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public StopWatch(){
        this.startTime = new Date().getTime();

    }
    public void start(){
        java.util.Date tempVar = new java.util.Date();
        this.startTime=tempVar.getTime();
        //return this.startTime;
    }

    public void end(){
        java.util.Date tempVar = new java.util.Date();
        this.endTime=tempVar.getTime();
        //return this.endTime;
    }
    public long getElapseTime(){
        return this.endTime - this.startTime;
    }

}
class TestStopWatch{
    public static void main(String[] args) {
        StopWatch appleWatch = new StopWatch();
        appleWatch.start();
        for (long i = 0; i<10000000000L;i++){
            continue;
        }
        appleWatch.end();
        System.out.println(appleWatch.getElapseTime());


    }
}