package xRep.classwork;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public static Location locateLargest(double[][] a){
        Location result = new Location();
        double maxValue = a[0][0];
        int tempRow = 0;
        int tempColumn = 0;
        for (int i = 0;i<a.length;i++){
            for (int j = 0; j<a[i].length;j++){
                if (maxValue<a[i][j]){
                    maxValue=Math.max(maxValue,a[i][j]);
                    tempRow=i;
                    tempColumn=j;
                }
            }

        }
        result.column=tempColumn;
        result.row=tempRow;
        result.maxValue=maxValue;
        return result;
    }

    @Override
    public String toString() {
        return "Наибольший элемент массива, равный " + this.maxValue + ", находится в позиции (" + this.row + ", " + this.column + ")";
    }

}

class TestLocation{

    public static void main(String[] args) {
        double[][] matrix = new double[2][];
        matrix[0] = new double[] {0,1,2,3,4,5,6,7,8,9};
        matrix[1] = new double[] {10,11,12,137,13,14,15,16,17,18,19,20};
        Location object=Location.locateLargest(matrix);
        System.out.println(object);



    }
}
