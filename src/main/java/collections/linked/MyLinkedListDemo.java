package collections.linked;

public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyContainer<Integer> myContainer = new MyContainer<Integer>();
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myContainer.setData(10);
        myLinkedList.add(10);
        System.out.println(myContainer.getData());
        System.out.println(myLinkedList.size());

    }
}
