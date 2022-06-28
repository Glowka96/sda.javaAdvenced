package object.reapet.person;

import java.util.Random;

public class PersonDemo {
    public static void main(String[] args) {
        int number = 10;
        String text = "abc";
        Random random = new Random();
        int[] liczby = new int[10];

        Person person1 = new Person("Seba", 26);
        Person person2 = new Person("Zofia", 25);


        System.out.println(person1);
        System.out.println(person2);
    }
}
