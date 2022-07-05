package citizen;

import java.util.ArrayList;
import java.util.List;

public class Town {
    private final List<Citizen> citizens;

    Town(Citizen ... citizens){
        this.citizens = List.of(citizens);
    }
    public void showCitizenWhoCanVote() {
        for (Citizen citizen :
                citizens) {
            if(citizen.canVote()){
                System.out.println(citizen.getName());
            }
        }
    }

    public void howManyWhoCanVote() {
        int count = 0;
        for (Citizen citizens :
                citizens) {
            if (citizens.canVote()) {
                count++;
            }
        }
        System.out.println(count);
    }
}


