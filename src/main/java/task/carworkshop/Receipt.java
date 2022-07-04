package task.carworkshop;

public class Receipt {
    private String service;
    private double price;
    private double totalPrice;
    private int count;

    Receipt(String service, int count, double price){
        this.service = service;
        this.count = count;
        this.price = price;
        totalPrice = count * price;
    }

    public void printReceipt(){
        System.out.printf("Service %s count: %d price: %.2f total price: %.2f\n", service, count, price, totalPrice);
    }

    @Override
    public String toString() {
        return "Receipt: " +
                " price: " + price +
                " for repair of " + count +
                " " + service;
    }
}
