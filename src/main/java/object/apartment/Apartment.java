package object.apartment;

import java.util.Arrays;

public class Apartment {
    private Flat[] flats;
    public Apartment(Flat[] flats) {
        this.flats = flats;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "flats=" + Arrays.toString(flats) +
                '}';
    }

    public Flat findFlat(int numberFlat) {
        for (Flat flat :
                flats) {
            if (numberFlat == flat.getNumberFlat()){
                return flat;
            }
        }
        return null;
    }
}
