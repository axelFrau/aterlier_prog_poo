package root.Forme2D;

import java.text.DecimalFormat;

public class Rectangle extends Forme2D {
    /***************** Class and Static variables *****************/
    private int longueur;
    private int largeur;
    DecimalFormat df = new DecimalFormat("#.##");


    /***************** Constructor *****************/
    public Rectangle(String name, int longueur, int largeur){
        super(name);
        this.longueur = longueur;
        this.largeur = largeur;
        this.setPerimetre(this.calculPerimetre());
        this.setSurface(this.calculSurface());
    }
    /***************** Getter and Setter *****************/

    public int getLongueur() {
        return this.longueur;
    }
    public int getLargeur() {
        return this.largeur;
    }

    /***************** Class and Static method Method *****************/

    @Override
    public double calculPerimetre(){
        return (this.longueur + this.largeur) * 2;
    }

    @Override
    protected double calculSurface(){
        return this.longueur * this.largeur;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return str + "\nLongueur : " + getLongueur() +"m | Largeur: " + getLargeur() + "m\nPerimètre : " + df.format(this.getPerimetre()) +"m\nSurface : " + df.format(this.getSurface())+"m²";
    }
}
