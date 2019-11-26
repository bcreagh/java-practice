package algos_and_data_structures.linkedlist;

public class SimpleLinkedListNode<T> {

    private T value;
    private SimpleLinkedListNode<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SimpleLinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(SimpleLinkedListNode<T> next) {
        this.next = next;
    }

}
