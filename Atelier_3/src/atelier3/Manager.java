package atelier3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employe{

    private Secretaire secretaire;

    /**
     * Constructeur pour Manager
     * @param leNom - String
     * @param lePrenom - String
     * @param laDate - GregorianCalendar
     * @param lAdresse - Adresse
     * @param salaire - Double
     * @param dateEmbauche - GregorianCalendar
     */
    public Manager(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, double salaire, GregorianCalendar dateEmbauche){
        super(leNom,lePrenom,laDate,lAdresse,salaire,dateEmbauche);
        salaireManager();

    }

    /**
     * Function that ajust Mnager's salary by adding 0.5% for each year passed in the company
     */
    public void salaireManager(){
        double tauxManager = 0.5/100;
        int ancienneté = this.calculAnnuite();
        this.augmenterLeSalaire(tauxManager*ancienneté);
    }

    /**
     * This function changes the secretary affected to the manager
     * @param secretaire - Secretaire
     */
    public void setSecretaire(Secretaire secretaire){
        if (this.secretaire != null && !this.secretaire.equals(secretaire)) {
            this.secretaire.delManager(this);
        }
        this.secretaire = secretaire;
        this.secretaire.addManager(this);
    }

    /**
     *
     *  @return Secretaire affected to the manager
     */
    public Secretaire getSecretaire(){ return this.secretaire; }

}
