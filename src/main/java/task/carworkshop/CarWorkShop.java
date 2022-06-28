package task.carworkshop;

public class CarWorkShop {
    private Car car;

    CarWorkShop(Car car){
        this.car = car;
    }

    public Receipt repairTire(){
        int price = 0;
        int count = 0;
        for (Tire tire :
                car.getTires()) {
            if(tire.isPierced()) {
                price += 50;
                count ++;
                tire.newTire();
            }
        }
        return new Receipt(price, count, "tire");
    }
}
