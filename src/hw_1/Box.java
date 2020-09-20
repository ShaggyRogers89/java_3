package hw_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    ArrayList<T> box = new ArrayList();
    String name;

    public Box(String name, T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
        this.name = name;
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (int i = 0; i < box.size(); i++) {
            weight = weight + box.get(i).getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> boxWithSomething) {
        return Math.abs(getWeight() - boxWithSomething.getWeight()) < 0.0001f;
    }

    public void replaceFruitsToAnotherBox(Box<T> anotherBox) {
        anotherBox.box.addAll(this.box);
        this.box.clear();
    }
}

