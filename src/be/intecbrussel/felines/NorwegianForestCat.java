package be.intecbrussel.felines;

public class NorwegianForestCat extends Felis {
    //constructors
    public NorwegianForestCat() {
        super();
    }

    public NorwegianForestCat(char size, char coat, String colour, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, colour, weight, name, age, shelterNo, badgeNo);
    }


    //custom methods
    public void miauwInNorwegian() {
        System.out.println("Miåøw");
    }

    @Override
    public String toString() {
        return "Data-type: NorwegianForestCat; "
                + super.toString();
    }
}
