package atelier3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employe{

    private Secretaire secretaire;

    public Manager(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, double salaire, GregorianCalendar dateEmbauche){
        super(leNom,lePrenom,laDate,lAdresse,salaire,dateEmbauche);
        salaireManager();

    }

    public void salaireManager(){
        double tauxManager = 0.5/100;
        int ancienneté = this.calculAnnuite();
        this.augmenterLeSalaire(tauxManager*ancienneté);
    }

    public void setSecretaire(Secretaire secretaire){
        if (this.secretaire != null && !this.secretaire.equals(secretaire)) {
            this.secretaire.delManager(this);
        }
        this.secretaire = secretaire;
        this.secretaire.addManager(this);
    }

    public Secretaire getSecretaire(){ return this.secretaire; }

}
