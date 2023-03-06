package be.intecbrussel.felines;

public abstract class Acinonyx extends Animal {
    //properties
    private double speed;


    //no constructors because this class is abstract and has no subclasses


    //getters & setters
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    //custom methods
    public void run(double distance) {
        System.out.println("Running " + distance + " meters!");
    }

    public void kiauuww() {
        System.out.println("This methods name is an onomatopoeia");
    }

    @Override
    public String toString() {
        return "Data-type: Acinonyx; "
                + super.toString()
                + "Speed: " + this.getSpeed()
                + "; ";
    }
}

