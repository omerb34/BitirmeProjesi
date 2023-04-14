package pojos;

public class Sort {
    private boolean sorted;
    private boolean empty;
    private boolean unsorted;

    public Sort() {
    }

    public Sort(boolean sorted, boolean empty, boolean unsorted) {
        this.sorted = sorted;
        this.empty = empty;
        this.unsorted = unsorted;
    }

    public boolean isSorted() {
        return sorted;
    }

    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isUnsorted() {
        return unsorted;
    }

    public void setUnsorted(boolean unsorted) {
        this.unsorted = unsorted;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "sorted=" + sorted +
                ", empty=" + empty +
                ", unsorted=" + unsorted +
                '}';
    }
}
