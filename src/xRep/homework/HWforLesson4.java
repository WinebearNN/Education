package xRep.homework;

public class HWforLesson4 {
    public static void main(String[] args) {
        double[] numbers ={1,2,3,4};
        //System.out.println(maxValueFromArray(numbers));


    }
    public static double maxValueFromArray(double[] array) {
        double maxValue=0;
        for(double number:array){
            maxValue=Math.max(maxValue,number);
        }

        return maxValue;
    }
}
