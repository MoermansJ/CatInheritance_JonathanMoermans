package be.intecbrussel.felines;

public abstract class Panthera extends Animal {
    //no constructors because this class is abstract and has no subclasses

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
