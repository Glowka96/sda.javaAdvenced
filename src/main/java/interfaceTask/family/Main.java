package interfaceTask.family;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Daughter daughter = new Daughter("Jola");
        Son son = new Son("Arek");
        Mother mother = new Mother("Agnieszka");
        Father father = new Father("Radek");

        List<FamilyMember> familyMembers = new ArrayList<>();
        familyMembers.add(daughter);
        familyMembers.add(son);
        familyMembers.add(mother);
        familyMembers.add(father);

        for (FamilyMember member :
                familyMembers) {
            member.presentYourself();
            member.isAdult();
        }
    }
}
