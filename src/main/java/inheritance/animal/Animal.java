package inheritance.animal;

public class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal() {
    }

    public void eat(){
        System.out.println("Eat food");
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    void dataAnimal(){
        System.out.print(getName() + " " + getAge() + " " + getWeight());
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
