package be.intecbrussel.felines;

import javax.crypto.Cipher;

public abstract class Animal {
    //fields
    protected static int animalCount;


    //properties
    private CoatsAndSizes size;
    private CoatsAndSizes coat;
    private String colour;
    private double weight;


    //constructors
    public Animal() {
        this(CoatsAndSizes.MEDIUM, CoatsAndSizes.MEDIUM, "black", 3.5);
    }

    public Animal(CoatsAndSizes size, CoatsAndSizes coat, String colour, double weight) {
        setSize(size);
        setCoat(coat);
        setColour(colour);
        setWeight(weight);
        animalCount++;
    }


    //getters & setters
    public static int getAnimalCount() {
        return animalCount;
    }

    public static void setAnimalCount(int animalCount) {
        Animal.animalCount = animalCount;
    }

    public char getSize() {
        return size.getCharRepresentation();
    }

    public void setSize(CoatsAndSizes size) {
        this.size = size;
    }

    public char getCoat() {
        return coat.getCharRepresentation();
    }

    public void setCoat(CoatsAndSizes coat) {
        this.coat = coat;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    //custom methods
    public void makeNoise(String sound) {
        System.out.println(sound);
    }

    public void eat() {
        System.out.println("Omnomnomnomnom");
    }

    public void sleep() {
        System.out.println("zzzzZZZZzzzzZZZZzzzzZZZZzzzz");
    }

    public boolean isAlive() {
        return true;
    }

    @Override
    public String toString() {
        return "Size: " + this.getSize()
                + "; Coat: " + this.getCoat()
                + "; Colour: " + this.getColour()
                + "; Weight: " + this.getWeight()
                + "; ";
    }

}
