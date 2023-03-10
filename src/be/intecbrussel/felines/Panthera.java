package be.intecbrussel.felines;

public abstract class Panthera extends Animal {
    //custom methods
    public String roar() {
        return "Miauwkes!";
    }

    public void hunt() {
        System.out.println("Hunting!");
    }

    @Override
    public String toString() {
        return "Data-type: Panthera; "
                + super.toString();
    }
}
