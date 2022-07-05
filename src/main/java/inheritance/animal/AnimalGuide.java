package inheritance.animal;

import java.util.List;

public class AnimalGuide {
    public void feedAnimal(Animal animal){
        System.out.println("Feed animal");
        animal.eat();
        animal.makeSound();
    }

    public void guideAnimal(List<Animal> animals){
        for (Animal animal :
                animals) {
            feedAnimal(animal);
            animal.dataAnimal();
        }
    }
}
