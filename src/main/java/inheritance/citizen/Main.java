package inheritance.citizen;

public class Main {
    public static void main(String[] args) {
        King king = new King("Seba");
        Townsman townsman = new Townsman("Lolek");
        Peasant peasant = new Peasant("Jerzy");
        Soldier soldier = new Soldier("Radek");
        Soldier soldier1 = new Soldier("Grzegorz");
        Townsman townsman1 = new Townsman("Arek");

        Town town = new Town(king, townsman, peasant, soldier, soldier1, townsman1);

        town.howManyWhoCanVote();
        town.showCitizenWhoCanVote();


    }
}


