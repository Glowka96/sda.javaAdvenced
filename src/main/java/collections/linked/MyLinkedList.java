package collections.linked;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {
    private MyNode<E> firstNode = null;
    private int actualSize = 0;

    @Override
    public boolean add(E e) {
        MyNode<E> newNode = new MyNode(e);
        actualSize++;
        if (firstNode == null) {
            firstNode = newNode;
            return true;
        }

        MyNode<E> actualNode = firstNode;
        while (actualNode.nextNode != null) {
            actualNode = actualNode.nextNode;
        }
        actualNode.nextNode = newNode;
        return false;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= actualSize) {
            throw new IndexOutOfBoundsException();
        }
        MyNode<E> actualNode = firstNode;
        for (int i = 1; i <= index; i++) {
            actualNode = actualNode.nextNode;
        }
        return actualNode.data;
    }

    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public void add(int index, E e) {
       MyNode<E> newNode = new MyNode(e);
        actualSize++;
        if (firstNode == null) {
            firstNode = newNode;
        }

        MyNode<E> actualNode = firstNode;
        MyNode<E> tempNode = null;
        for (int i = 1; i <= index; i++) {
            tempNode = actualNode;
            actualNode = actualNode.nextNode;
        }
        newNode.nextNode = actualNode;
        tempNode.nextNode = newNode;

        if (tempNode == null) { // dalej nie ma poprzedniego a więc - zmienił się pierwszy node!
            firstNode = newNode;
        }else{
            tempNode.nextNode = newNode; // jeśli był poprzedni to ma wskazywać na ten nowy
        }
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E remove(int i) {
        return null;
    }

    @Override
    public E set(int i, E e) {
        return null;
    }


    @Override
    public boolean isEmpty() {
        return false;
    }


    class MyNode<E> {
        private E data;
        private MyNode<E> nextNode = null;
        
        MyNode(){
            
        }

        public MyNode(E data) {
            this.data = data;
        }
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
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
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
    public ListIterator<E> listIterator(int i) {
        return null;
    }

    @Override
    public List<E> subList(int i, int i1) {
        return null;
    }
}
