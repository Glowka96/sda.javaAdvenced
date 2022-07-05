package citizen;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        King king = new King("Seba");
        Townsman townsman = new Townsman("Lolek");
        Peasant peasant = new Peasant("Jerzy");
        Soldier soldier = new Soldier("Radek");
        Soldier soldier1 = new Soldier("Grzegorz");
        Townsman townsman1 = new Townsman("Arek");
        town.getCitizens().add(king);
        town.getCitizens().add(townsman);
        town.getCitizens().add(peasant);
        town.getCitizens().add(soldier);
        town.getCitizens().add(soldier1);
        town.getCitizens().add(townsman1);

        town.howManyWhoCanVote();
        town.showCitizenWhoCanVote();


    }
}


