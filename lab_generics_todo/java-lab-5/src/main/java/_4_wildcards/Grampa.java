package _4_wildcards;

public class Grampa {

    private String name;

    public Grampa (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My name is " + name + ". I am a " + this.getClass().getSimpleName() + "!";
    }

}
