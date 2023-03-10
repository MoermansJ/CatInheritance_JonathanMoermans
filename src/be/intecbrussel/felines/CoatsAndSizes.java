package be.intecbrussel.felines;

public enum CoatsAndSizes {
    //instances
    SMALL('S'),
    MEDIUM('M'),
    LARGE('L');


    //properties
    private char charRepresentation;


    //constructors
    CoatsAndSizes(char charRepresentation) {
        setCharRepresentation(charRepresentation);
    }


    //getters & setters
    public char getCharRepresentation() {
        return charRepresentation;
    }

    public void setCharRepresentation(char charRepresentation) {
        this.charRepresentation = charRepresentation;
    }
}
