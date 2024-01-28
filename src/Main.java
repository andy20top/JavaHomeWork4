import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     * В данной работе реализован принцип подстановки Лисков.
     * Так как насколько видим, можем создавать разные объекты с родительским классом
     * и они уживаются друг с другом в списке.
     */

    /**
     * Также реализовал принцип единственной ответственности.
     * Если у нас что-то поменяется в логике создания фруктовой корзины или
     * вывода ее на экран. Мы можем это сделать, не изменяя методов в основных классах.
     *
     */
    public static void main(String[] args) {
        Box<Fruit> box = GetterFruitBox.getFruitBox();
        Fruit apple = new Apple();
        Fruit orange = new Orange();

        box.put(apple);
        box.put(orange);

        System.out.println(box.get());
        System.out.println("________________________");
        Printer.printBox(box);
    }
}
