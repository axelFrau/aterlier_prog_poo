package root;

public abstract class Forme {
    /***************** Class and Static variables *****************/
    protected static int counter = 0;
    protected String identifier;
    protected double surface;

    /***************** Constructor *****************/
    protected Forme(String name){
        counter ++;
        this.identifier = name + "_n°" + counter;
    }
    /***************** Getter and Setter *****************/

    public String getIdentifier(){
        return this.identifier;
    }

    public double getSurface(){
      return this.surface;
    }

    public void setSurface(double surface){
        this.surface = surface;
    }

    /***************** Class and Static method Method *****************/

    protected abstract double calculSurface();

    @Override
    public String toString() {
        return "Identifiant de l'objet : " + this.getIdentifier();
    }
}
