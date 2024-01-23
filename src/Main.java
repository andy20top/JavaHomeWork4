import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Fruit> box = getFruitBox();
        printBox(box);
//        System.out.println(box.get(3));
    }


       public static Box<Fruit> getFruitBox() {
            Box<Fruit> fruitBox = new Box<>();
            fruitBox.put(new Apple());
            fruitBox.put(new Orange());
            fruitBox.put(new Orange());
            fruitBox.put(new Orange());
            fruitBox.put(new Orange());
            fruitBox.put(new Apple());
            fruitBox.put(new Apple());
            fruitBox.put(new Apple());
            fruitBox.put(new Apple());
            return fruitBox;
       }

      public static void printBox(Box<? extends Fruit> box) {
            for (Fruit item : box) {
                System.out.println(item);
            }
      }
}
