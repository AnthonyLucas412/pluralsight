package collections;

public class FixedList <T> {

    private FixedList<T> items;
    private int maxSize;

    public FixedList<T> getItems() {
        return items;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setItems(FixedList<T> items) {
        this.items = items;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

}
