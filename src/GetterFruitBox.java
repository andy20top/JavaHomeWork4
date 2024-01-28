public class GetterFruitBox {
    public static Box<Fruit> getFruitBox() {
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.put(new Apple());
        fruitBox.put(new Orange());
        return fruitBox;
    }
}
