import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static  void main(String[] args) {
        Set<Phone> phones = new TreeSet<>(); // строка 1
        phones.add(new Phone("Apple", 243423424L, "black", new String[]{"гарнитура", "адаптер", "провод"})); // строка 2
        phones.add(new Phone("Samsung", 112313213L, "white", new String[]{"гарнитура", "адаптер", "провод"}));
        System.out.println(phones);

        for (Phone product : phones) {
            System.out.println(product.getColour());
            product.param();
        }
    }
}
