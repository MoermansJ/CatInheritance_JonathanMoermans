package be.intecbrussel.felines;

public class AndeanMountainCat extends Felis {
    //constructors
    public AndeanMountainCat() {
        super();
    }

    public AndeanMountainCat(char size, char coat, String colour, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, colour, weight, name, age, shelterNo, badgeNo);
    }

    
    //custom methods
    public void miauw(String customSound) {
        //this method is not an override because of the difference in parameter datatypes?
        this.makeNoise(customSound);
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public String toString() {
        return "Data-type: AndeanMountainCat; "
                + super.toString();
    }
}
