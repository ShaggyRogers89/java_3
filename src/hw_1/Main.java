package hw_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] integerArr = {1, 2, 3, 4, 5};
        String[] stringArray = {" one ", " two ", " three ", " four ", " five "};

        swap(stringArray, 2, 3);
        swap(integerArr, 0,2);
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(integerArr));

        arrayToArrayList(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }

    //1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

    public static void swap(Object[] arr, int i, int j) {
        Object tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //2. Написать метод, который преобразует массив в ArrayList;

    public static <T> ArrayList<T> arrayToArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }

}
