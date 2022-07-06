package inheritance.animal;

import inheritance.animal.interfaceAnimal.LandCreatures;
import inheritance.animal.interfaceAnimal.WildAnimal;

public class Monkey extends Animal implements WildAnimal, LandCreatures {
    private String haris;


    Monkey(String name, int age, double weight, String haris){
        super(name, age, weight);
        this.haris = haris;
    }

    @Override
    public void eat() {
        System.out.println("Eat banana");
    }

    @Override
    void dataAnimal() {
        super.dataAnimal();
        System.out.println(" " + getHaris());
    }

    public String getHaris() {
        return haris;
    }

    @Override
    public void makeSound() {
        System.out.println("uhaha");
    }


    @Override
    public String toString() {
        return "Monkey{" +
                "size=" + haris +
                '}';
    }
}
