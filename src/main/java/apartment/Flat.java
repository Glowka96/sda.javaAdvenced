package apartment;

public class Flat {

    private boolean isRentWasPain;
    private final int numberFlat;

    Flat(int numberFlat) {
        this.numberFlat = numberFlat;
    }

    public int getNumberFlat() {
        return numberFlat;
    }

    public void setRentWasPain() {
        isRentWasPain = true;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "isRentWasPain=" + isRentWasPain +
                ", numberFlat=" + numberFlat +
                '}';
    }
}

