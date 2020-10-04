package root.Forme2D;

import java.text.DecimalFormat;

public class Cercle extends Forme2D{
    /***************** Class and Static variables *****************/
    private int rayon;
    DecimalFormat df = new DecimalFormat("#.##");


    /***************** Constructor *****************/
    public Cercle(String name, int rayon){
        super(name);
        this.rayon = rayon;
        this.setPerimetre(this.calculPerimetre());
        this.setSurface(this.calculSurface());
    }
    /***************** Getter and Setter *****************/

    public int getRayon() {
        return this.rayon;
    }

    /***************** Class and Static method Method *****************/

    @Override
    public double calculPerimetre(){
        return 2 * this.rayon * Math.PI;
    }

    @Override
    protected double calculSurface(){
        return Math.PI * Math.pow(this.rayon, 2);
    }

    @Override
    public String toString() {
        String str = super.toString();
        return str + "\nRayon : " + getRayon() + "m\nPerimètre : " + df.format(this.getPerimetre()) +"m\nSurface : " + df.format(this.getSurface())+"m²";
    }
}
