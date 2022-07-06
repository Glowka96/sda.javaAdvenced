package sdaTask.person;

public class Staff extends Person{
    String specialization;
    String remuneration;

    public Staff(String specialization, String remuneration) {
        this.specialization = specialization;
        this.remuneration = remuneration;
    }

    public Staff(String name, String address, String specialization, String remuneration) {
        super(name, address);
        this.specialization = specialization;
        this.remuneration = remuneration;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(String remuneration) {
        this.remuneration = remuneration;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", specialization='" + specialization + '\'' +
                ", remuneration='" + remuneration + '\'' +
                '}';
    }
}
