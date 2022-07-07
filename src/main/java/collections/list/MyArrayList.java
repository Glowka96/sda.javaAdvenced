package collections.list;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private final int SIZE = 10;
    private int actualSize = 0;
    private E[] elements = (E[]) new Object[SIZE];




    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public boolean add(E e) {
        if(actualSize == SIZE) {
            elements = newCapacity();
        }
        System.out.println(e);
        elements[actualSize++] = e;
        return true;
    }

    public E[] newCapacity(){
        E[] newArray = (E[]) new Object[SIZE*2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        return newArray;
    }

    @Override
    public boolean isEmpty() {
        return actualSize == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}

