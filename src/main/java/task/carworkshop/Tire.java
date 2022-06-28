package task.carworkshop;

public class Tire {
    private boolean pierced;
    private double pressure;

    Tire(){
        pierced = false;
        pressure = 2.3;
    }

    public boolean isPierced() {
        return pierced;
    }

    public void piercesTire() {
        this.pierced = true;
        this.pressure = 0.0;
    }

    public void newTire() {
        pierced = false;
        pressure = 2.3;
    }


    @Override
    public String toString() {
        return "Tire{" +
                "pierced=" + pierced +
                ", pressure=" + pressure +
                '}';
    }
}
