package object.reapet.cars;

public class Car {
    private String brand;
    private int mileage;
    private int reviewForMileage = 20000;

    Car(String brand, int mileage){
        this.brand = brand;
        this.mileage = mileage;
    }

    void showBrandAndMileage(){
        System.out.println("Brand: " + getBrand() + " mileage: " + getMileage());
    }

    void addMileageToCar(int distance){
        mileage += distance;
    }

    public int getMileage() {
        return mileage;
    }

    public String getBrand() {
        return brand;
    }

    int howMuchToReviewForMileage(){
        return reviewForMileage - mileage % reviewForMileage;
    }

    @Override
    public String toString() {

        return "Brand: " + brand + " mileage: " + mileage + " reviewForMileage: " + howMuchToReviewForMileage();
    }
}
