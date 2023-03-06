package be.intecbrussel.felines;

public abstract class Animal {
    //fields
    static int animalCount;


    //properties
    private char size;
    private char coat;
    private String colour;
    private double weight;


    //constructors
    public Animal() {
        this('m', 'm', "black", 3.5);
    }

    public Animal(char size, char coat, String colour, double weight) {
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
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
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
