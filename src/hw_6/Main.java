package hw_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        task1(arr);

    }





   public static int[] task1(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] == 4) {
                int[] outArray = new int[arr.length -1 - i];
                int k=0;
                for (int j = i+1; j < arr.length; j++) {
                    outArray[k] = arr[j];
                    System.out.println(outArray[k] + ", ");
                    k++;
                    System.out.println(Arrays.toString(outArray));
                }
                return outArray;
            }
        }
        throw new RuntimeException("4 not found");
    }
}
