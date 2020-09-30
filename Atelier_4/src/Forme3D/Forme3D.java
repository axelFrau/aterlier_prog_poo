package Forme3D;

import root.Forme;

public abstract class Forme3D extends Forme {

    protected double volume;

    protected Forme3D(String name, double volume){
        super(name);
    }

    public abstract double getVolume();
}
