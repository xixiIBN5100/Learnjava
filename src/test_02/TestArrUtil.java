package test_02;

import java.util.Arrays;
import java.util.OptionalDouble;

public class TestArrUtil {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        String str = ArrUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {2.,2.5,7.5,100};
        System.out.println(ArrUtil.getAerage(arr2));
        OptionalDouble a = Arrays.stream(arr2).max();
        System.out.println(a);
    }
}
