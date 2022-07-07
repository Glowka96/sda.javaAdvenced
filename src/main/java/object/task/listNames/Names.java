package object.task.listNames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Names {
    static List<String > names = new ArrayList<>(Arrays.asList("Sebastian", "Dominik", "Klaudia", "Kamil", "Emilia"));
    static List<String> names2 = new ArrayList<>(Arrays.asList("Roksana", "Tomek"));

    public static void main(String[] args) {
        System.out.println(names);

        System.out.println(names.get(0));

        names.set(1, "Marcin");
        names.remove(3);

        names2.addAll(names);

        System.out.println();
        for (String name :
                names2) {
            System.out.println(name.toUpperCase());
        }
        System.out.println();

        for (String name : names2) {
            if(name.matches("\\w*a+"))
            System.out.println(name);
        }


    }
}
