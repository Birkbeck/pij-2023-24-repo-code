package pij.day13.lab;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of SimpleList<E> using a generic singly-linked list.
 *
 * @param <E> the type of elements in this list
 */
public class SimpleLinkedList<E> implements SimpleList<E> {

    /**
     * The first element of the list. If it is null, this means that the list
     * is currently empty.
     */
    private Node<E> head;


    public SimpleLinkedList(SimpleList<? extends E> copyMe) {
        if (copyMe.isEmpty()) {
            return;
        }
        int size = copyMe.size();
        this.head = new Node<>(copyMe.get(0));
        Node<E> current = this.head;
        for (int i = 1; i < size; i++) {
            this.head.add(i, copyMe.get(i));
            /*
            Node<E> next = new Node<>(copyMe.get(i));
            current.setNext(next);

             */
        }
    }

    public SimpleLinkedList(SimpleLinkedList<? extends E> copyMe) {
        //this((SimpleList<? extends E>) copyMe);

        if (copyMe.isEmpty()) {
            return;
        }
        this.head = new Node<>(copyMe.get(0));
        Node<E> current = this.head;
        Node<? extends E> other = copyMe.head.getNext();
        while (other != null) {
            Node<E> next = new Node<>(other.getData());
            current.setNext(next);
            current = next;
            other = other.getNext();
        }

    }

    public SimpleLinkedList() {
        // This constructor intentionally left empty: the default values
        // of the fields are suitable for the empty list.
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public int size() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.head.size();
    }

    @Override
    public E get(int index) {
        if (this.isEmpty()) {
            throw new IllegalArgumentException("Cannot get anything in an empty list!");
        }
        return this.head.get(index);
    }

    @Override
    public boolean contains(Object o) {
        if (this.isEmpty()) {
            return false;
        }
        return this.head.contains(o);
    }

    @Override
    public int indexOf(Object o) {
        if (this.isEmpty()) {
            return -1;
        }
        return this.head.indexOf(o);
    }

    @Override
    public void clear() {
        // Java's garbage collector will do the actual clearing of the memory
        this.head = null;
    }

    @Override
    public E set(int index, E element) {
        if (this.isEmpty()) {
            throw new IllegalArgumentException("Cannot set in an empty list!");
        }
        return this.head.set(index, element);
    }

    @Override
    public void add(int index, E element) {
        if (index == 0) {
            this.head = new Node<>(element, this.head);
        } else if (this.isEmpty()) {
            throw new IllegalArgumentException("Can add to empty list only at index 0, found " + index);
        } else {
            this.head.add(index, element);
        }
    }

    @Override
    public E remove(int index) {
        if (this.isEmpty()) {
            throw new IllegalArgumentException("Cannot remove from an empty list!");
        }
        if (index == 0) {
            E result = this.head.getData();
            this.head = this.head.getNext();
            return result;
        }
        return this.head.remove(index);
    }

    @Override
    public List<E> toList() {
        List<E> result = new ArrayList<>();
        if (!this.isEmpty()) {
            this.head.fillList(result);
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (!this.isEmpty()) {
            this.head.fillStringBuilder(sb);
        }
        sb.append("]");
        return sb.toString();
    }
}
