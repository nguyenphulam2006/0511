import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortable<E extends Comparable<E>> {

    private List<E> items;

    public ListSortable() {
        this.items = new ArrayList<>();
    }

    public void add(E item) {
        this.items.add(item);
    }

    public void print() {
        Collections.sort(this.items);

        for (E item : this.items) {
            System.out.println(item);
        }
    }
}