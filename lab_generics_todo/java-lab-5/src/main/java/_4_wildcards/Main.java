package _4_wildcards;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Grampa> grampas = List.of(
                new Grampa("Joe"),
                new Grampa("Sam"),
                new Grampa("Kenneth")
        );

        List<Father> fathers = List.of(
                new Father("John"),
                new Father("Martin"),
                new Father("Steven")
        );

        List<Child> children = List.of(
                new Child("Becca"),
                new Child("Naomi"),
                new Child("Benny")
        );

        List<String> names = List.of("Kenneth", "John");

        WildcardsExample wildEx = new WildcardsExample();
        wildEx.printNames_allFamily(grampas);
        wildEx.printNames_allFamily(fathers);
        wildEx.printNames_allFamily(children);

    }
}
