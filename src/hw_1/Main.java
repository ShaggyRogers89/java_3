package hw_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] integerArr = {1, 2, 3, 4, 5};
        String[] stringArray = {" one ", " two ", " three ", " four ", " five "};

        swap(stringArray, 2, 3);
        swap(integerArr, 0, 2);
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(integerArr));

        arrayToArrayList(stringArray);
        System.out.println(Arrays.toString(stringArray));


        Box<Apple> boxApple = new Box<Apple>("AppleBox", new Apple(), new Apple(), new Apple()); //создание коробки конкретного класса Apple
        Box<Orange> boxOrange = new Box<Orange>("OrangeBox", new Orange(), new Orange(), new Orange()); //создание коробки конкретного класса Orange
        Box<Orange> boxOrange2 = new Box<Orange>("OrangeBox2", new Orange(), new Orange(), new Orange()); //создание второй коробки конкретного класса Orange
        Box<Orange> anotherOrange = new Box<Orange>("EmptyBox"); //создание пустой коробки конкретного класса Orange для будущего переноса Orange

        System.out.println(boxApple.name + " weight: " + boxApple.getWeight());
        System.out.println(boxOrange.name + " weight: " + boxOrange.getWeight());
        System.out.println(boxOrange2.name + " weight: " + boxOrange2.getWeight());
        System.out.println(boxApple.compare(boxOrange));
        System.out.println(boxOrange.compare(boxOrange2));
        System.out.println(boxOrange.name + " contains this ones " + boxOrange.getBox());
        System.out.println("Now we put oranges from "+ boxOrange.name + " to " + anotherOrange.name);
        boxOrange.replaceFruitsToAnotherBox(anotherOrange);
        System.out.println(anotherOrange.name + " now contains " + anotherOrange.getBox());
        System.out.println(boxOrange.name +" is now empty " + boxOrange.getBox());
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
