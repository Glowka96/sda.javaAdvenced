package apartment;

public class ApartmentDemo {
    public static void main(String[] args) {

        Flat flat1 = new Flat(2);
        Flat flat2 = new Flat(4);

        Flat[] flats = new Flat[2];
        flats[0] = flat1;
        flats[1] = flat2;


        Apartment apartment = new Apartment(flats);

        System.out.println(apartment);

        CooperativeService service = new CooperativeService(apartment);
        service.rentPain(2);
        System.out.println(apartment);

    }
}
