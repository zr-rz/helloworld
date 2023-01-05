package basic.generic;

public class Generic<T> {
    private T first;
    private T last;

    public Generic(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getLast() {
        return last;
    }

    public void setLast(T last) {
        this.last = last;
    }

    public static <K> Generic<K> create(K fi, K la) {
        return new Generic<K>(fi, la);
    }

}
