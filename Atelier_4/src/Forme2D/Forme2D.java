package Forme2D;


import root.Forme;

public abstract class Forme2D extends Forme {

    protected double perimetre;

    protected Forme2D(String name, double perimetre){
        super(name);
    }

    public abstract double getPerimetre();
}

