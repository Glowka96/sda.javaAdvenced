package task.carworkshop;

public class Receipt {
    private int price;
    private int count;
    private String service;

    Receipt(int price, int count, String service){
        this.price = price;
        this.count = count;
        this.service = service;
    }

    @Override
    public String toString() {
        return "Receipt: " +
                " price: " + price +
                " for repair of " + count +
                " " + service;
    }
}
