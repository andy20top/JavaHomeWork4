import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Box<T extends Fruit> implements Iterable<Fruit> {
    List<T> boxFruit;

    public Box() {
        this.boxFruit = new ArrayList<>();
    }
    public T get(int numElem) {
        return boxFruit.get(numElem);
    }

    public void put(T item) {
        this.boxFruit.add(item);
    }

    @Override
    public Iterator<Fruit> iterator() {
        return (Iterator<Fruit>) boxFruit.iterator();
    }
}
