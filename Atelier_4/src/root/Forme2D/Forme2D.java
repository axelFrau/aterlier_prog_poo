package root.Forme2D;


import root.Forme;

public abstract class Forme2D extends Forme {

    /***************** Class and Static variables *****************/
    protected double perimetre;

    /***************** Constructor *****************/
    protected Forme2D(String name){
        super(name);
    }

    /***************** Getter and Setter *****************/
    public double getPerimetre(){
        return this.perimetre;
    };

    public void setPerimetre(double perimetre){
        this.perimetre = perimetre;
    }
    /***************** Class and Static method *****************/
    public abstract double calculPerimetre();
}

