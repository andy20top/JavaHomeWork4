public class Printer {
    public static void printBox(Box<? extends Fruit> box) {
        for (Fruit item : box) {
            System.out.println(item);
        }
    }
}
