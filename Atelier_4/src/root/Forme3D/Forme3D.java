package root.Forme3D;


import root.Forme;

public abstract class Forme3D extends Forme {

    /***************** Class and Static variables *****************/
    protected double volume;

    /***************** Constructor *****************/
    protected Forme3D(String name){
        super(name);
    }

    /***************** Getter and Setter *****************/
    public double getVolume(){
        return this.volume;
    };

    public void setVolume(double volume){
        this.volume = volume;
    }
    /***************** Class and Static method *****************/
    public abstract double calculVolume();
}

