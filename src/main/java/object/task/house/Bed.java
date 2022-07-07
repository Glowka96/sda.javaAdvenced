package object.task.house;

public class Bed {
    private int newLinenHowManyDayAgo;

    Bed(int newLinenHowManyDayAgo) {
        this.newLinenHowManyDayAgo = newLinenHowManyDayAgo;
    }


    public void setNewLinen(){
        newLinenHowManyDayAgo = 0;
    }

    @Override
    public String toString() {
        return "\nBed{" +
                "newLinenHowManyDayAgo=" + newLinenHowManyDayAgo +
                '}';
    }
}
