package test_02;

public class ArrUtil {
    private ArrUtil(){};
    public static String printArr (int [] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int j : arr) {
            sb.append(j);
            sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
    public static double getAerage (double[] arr){
        float sum = 0;
        for(double j : arr){
            sum += j;
        }
        return sum/arr.length;

    }
}
