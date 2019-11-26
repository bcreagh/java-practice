package algos_and_data_structures.linkedlist;

import java.util.Collection;
import java.util.Iterator;


/**
 * This is a very simple linked list implementation. It is only used for the purposes of coding challenges.
 * Check this repo for a better implementation: https://github.com/bcreagh/java-algorithms
 */
public class SimpleLinkedList<T> implements Iterable<T> {

    private SimpleLinkedListNode<T> first = null;

    public SimpleLinkedList() {

    }

    public SimpleLinkedList(Collection<T> items) {
        items.stream().forEach(this::add);
    }


    public SimpleLinkedListNode<T> getFirst() {
        return first;
    }

    public boolean contains(T item) {
        SimpleLinkedListNode<T> currentNode = first;
        while (currentNode != null) {
            if (currentNode.equals(item)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public void add(T item) {
        SimpleLinkedListNode<T> newNode = new SimpleLinkedListNode<>();
        newNode.setValue(item);
        newNode.setNext(first);
        first = newNode;
    }

    public int size() {
        int size = 0;
        for (T item: this) {
            size++;
        }
        return size;
    }


    @Override
    public Iterator<T> iterator() {
        return new SimpleLinkedListIterator(first);
    }

    private class SimpleLinkedListIterator implements Iterator<T> {

        SimpleLinkedListNode<T> currentNode;

        public SimpleLinkedListIterator(SimpleLinkedListNode<T> first) {
            currentNode = first;
        }

        @Override
        public boolean hasNext() {
            return currentNode.getNext() != null;
        }

        @Override
        public T next() {
            currentNode = currentNode.getNext();
            return currentNode.getValue();
        }
    }
}
