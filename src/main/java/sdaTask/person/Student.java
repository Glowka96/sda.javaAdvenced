package sdaTask.person;

public class Student extends Person {
    String typeStudy;
    int yearOfStudy;
    double priceForStudy;

    public Student(String typeStudy, int yearOfStudy, double priceForStudy) {
        this.typeStudy = typeStudy;
        this.yearOfStudy = yearOfStudy;
        this.priceForStudy = priceForStudy;
    }

    public Student(String name, String address, String typeStudy, int yearOfStudy, double priceForStudy) {
        super(name, address);
        this.typeStudy = typeStudy;
        this.yearOfStudy = yearOfStudy;
        this.priceForStudy = priceForStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typeStudy='" + typeStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", priceForStudy=" + priceForStudy +
                '}';
    }
}
