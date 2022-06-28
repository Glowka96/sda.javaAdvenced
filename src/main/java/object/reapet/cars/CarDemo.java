package object.reapet.cars;

public class CarDemo {
    static Car[] cars = {
            new Car("Audi", 12412),
            new Car("Mazda", 64124),
            new Car("Toyota", 227512),
    };

    public static void main(String[] args) {
        for (Car car :
               cars) {
            System.out.println(car);
            car.addMileageToCar(2000);
            System.out.println(car);
            int review = car.howMuchToReviewForMileage();
            System.out.println(review);
        }
    }
}
