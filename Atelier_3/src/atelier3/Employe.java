package atelier3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employe extends Personne{
    protected GregorianCalendar dateEmbauche;
    protected double salaire;

    /**
     * Constructeur pour la classe Employe
     * @param leNom
     * @param lePrenom
     * @param laDate
     * @param lAdresse
     * @param salaire
     * @param dateEmbauche
     */
    protected Employe(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse,double salaire, GregorianCalendar dateEmbauche){
            super(leNom,lePrenom,laDate,lAdresse);
            this.dateEmbauche = dateEmbauche;
            this.salaire = salaire;
    }

    /**
     * Getter
     * @return double salaire
     */
    public double getSalaire() { return salaire; }

    /**
     * Setter
     * @param salaire - double
     */
    public void setSalaire(double salaire) { this.salaire = salaire; }

    /**
     * Getter
     * @return Date dateEmbauche
     */
    public GregorianCalendar getDateEmbauche() {
        return dateEmbauche;
    }

    /**
     * Setter
     * @param dateEmbauche
     */
    public void setDateEmbauche(GregorianCalendar dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    /**
     *
     * @param leNom le nom de la personne
     * @param lePrenom le prénom de la personne
     * @param laDate la date de naissance de la personne
     * @param lAdresse l'adresse de la personne
     * @param dateEmbauche la date d'embauche
     * @return Un objet Employe
     */
    public static Employe createEmploye(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse,int salaire, GregorianCalendar dateEmbauche){
        GregorianCalendar dateEmbaucheMinus16 = new GregorianCalendar(dateEmbauche.get(Calendar.YEAR) - 16,
                dateEmbauche.get(Calendar.MONTH),
                dateEmbauche.get(Calendar.DAY_OF_MONTH));
        GregorianCalendar dateEmbaucheMinus65 = new GregorianCalendar(dateEmbauche.get(Calendar.YEAR) - 65,
                dateEmbauche.get(Calendar.MONTH),
                dateEmbauche.get(Calendar.DAY_OF_MONTH));
        if (laDate.before(dateEmbaucheMinus16) && laDate.after(dateEmbaucheMinus65)){
            return new Employe(leNom,lePrenom,laDate,lAdresse,salaire,dateEmbauche);
        } else {
            return null;
        }
    }

    /**
     * Fucntion that raise the salary of an employe
     * @param montantPourcentage - double
     */
    public void augmenterLeSalaire(double montantPourcentage){
        if (montantPourcentage > 0){
            setSalaire(getSalaire() + getSalaire() * (montantPourcentage/100));
        } else {
            System.out.println("Pourcentage d'augmentation est négatif ou égale à 0");
        }
    }

    /**
     * Fucntion to calculate the number of year passed in the company
     * @return int
     */
    public int calculAnnuite(){
        GregorianCalendar today = new GregorianCalendar();
        return today.get(Calendar.YEAR) - this.getDateEmbauche().get(Calendar.YEAR) + 1;
    }

    /**
     * Override of toString for Employe.
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "\nSalaire : " + this.getSalaire() + " €"
                + "\nDate d'embauche : "
                + this.getDateEmbauche().get(Calendar.DAY_OF_MONTH)
                + "/" + this.getDateEmbauche().get(Calendar.MONTH)
                + "/" + this.getDateEmbauche().get(Calendar.YEAR);
    }
}
