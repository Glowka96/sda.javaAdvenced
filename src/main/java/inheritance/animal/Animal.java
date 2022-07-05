package inheritance.animal;

public abstract class Animal {
    private String name;
    private int age;
    private double weight;

    public void eat(){
        System.out.println("Eat food");
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void makeSound();

    void dataAnimal(){
        System.out.print(getName() + " " + getAge() + " " + getWeight());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
