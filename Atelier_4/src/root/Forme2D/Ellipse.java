package root.Forme2D;

import java.text.DecimalFormat;

public class Ellipse extends Forme2D{
    /***************** Class and Static variables *****************/
    private int rayonA;
    private int rayonB;
    DecimalFormat df = new DecimalFormat("#.##");


    /***************** Constructor *****************/
    public Ellipse(String name, int rayonA, int rayonB){
        super(name);
        this.rayonA = rayonA;
        this.rayonB = rayonB;
        this.setPerimetre(this.calculPerimetre());
        this.setSurface(this.calculSurface());
    }
    /***************** Getter and Setter *****************/

    public int getRayonA() {
        return this.rayonA;
    }
    public int getRayonB() {
        return this.rayonB;
    }

    /***************** Class and Static method Method *****************/

    @Override
    public double calculPerimetre(){
//        FORMULE DITES CLASSIQUE avec une marge d'erreur
//        return (2 * Math.PI) * Math.sqrt((Math.pow(this.rayonA,2) + Math.pow(this.rayonB,2))/2);
//      Formule n°1 de Ramanujan, qui est beaucoup plus précise.
        return Math.PI * (3*(this.rayonA + this.rayonB) - Math.sqrt(((3 * this.rayonA) + this.rayonB)*(this.rayonA + (3 * this.rayonB))));
    }

    @Override
    protected double calculSurface(){
        return this.rayonA * this.rayonB * Math.PI;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return str + "\nRayon A : " + getRayonA() +"m | Rayon B : " + getRayonB() + "m\nPerimètre : " + df.format(this.getPerimetre()) +"m\nSurface : " + df.format(this.getSurface())+"m²";
    }
}
