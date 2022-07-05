package citizen;

import java.util.ArrayList;
import java.util.List;

public class Town {
    private List<Citizen> citizens = new ArrayList<>();
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

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void setCitizens(List<Citizen> citizens) {
        this.citizens = citizens;
    }
}


