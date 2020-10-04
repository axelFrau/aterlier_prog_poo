package root.Forme3D;

import java.text.DecimalFormat;

public class Cylindre extends Forme3D{
    /***************** Class and Static variables *****************/
    private int rayon;
    private int hauteur;
    DecimalFormat df = new DecimalFormat("#.##");


    /***************** Constructor *****************/
    public Cylindre(String name, int rayon, int hauteur){
        super(name);
        this.rayon = rayon;
        this.hauteur = hauteur;
        this.setVolume(this.calculVolume());
        this.setSurface(this.calculSurface());
    }
    /***************** Getter and Setter *****************/

    public int getRayon() {
        return this.rayon;
    }
    public int getHauteur() {
        return this.hauteur;
    }

    /***************** Class and Static method Method *****************/

    @Override
    public double calculVolume(){
        return Math.PI * Math.pow(this.rayon, 2) * this.hauteur;
    }

    @Override
    protected double calculSurface(){
        return 0.1;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return str + "\nRayon A : " + getRayonA() +"m | Rayon B : " + getRayonB() + "m\nPerimètre : " + df.format(this.getPerimetre()) +"m\nSurface : " + df.format(this.getSurface())+"m²";
    }
}
