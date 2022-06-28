package apartment;

public class CooperativeService {
    private Apartment apartment;

    CooperativeService(Apartment apartment){
        this.apartment = apartment;
    }

    public void rentPain(int numberFlat){
        Flat flat = apartment.findFlat(numberFlat);
        if(flat == null) {
            return;
        }
        flat.setRentWasPain();
    }
}
