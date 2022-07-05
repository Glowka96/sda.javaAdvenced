package inheritance.animal;

public class AnimalDemo {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("Lucky" , 12, 65, "long");
        monkey.eat();
        monkey.dataAnimal();

        Whale whale = new Whale("Joki", 25, 20000, "Very big");
        whale.eat();
        whale.dataAnimal();
    }
}
