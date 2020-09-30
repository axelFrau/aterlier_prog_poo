package root;

public abstract class Forme {
    protected static int counter = 0;
    protected String identifier;
    protected double surface;

    protected Forme(String name){
        counter ++;
        this.identifier = name + "_n°" + counter;
    }

    public abstract String getIdentifier();

    public abstract double getSurface();
}
