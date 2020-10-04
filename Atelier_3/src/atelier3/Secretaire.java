package atelier3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Secretaire extends Employe{

    private ArrayList<Manager> managers;

    /**
     * Constructeur pour secretaire
     * @param leNom - String
     * @param lePrenom - String
     * @param laDate - GregorianCalendar
     * @param lAdresse - Adresse
     * @param salaire - Double
     * @param dateEmbauche - GregorianCalendar
     */
    public Secretaire(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, int salaire, GregorianCalendar dateEmbauche){
        super(leNom,lePrenom,laDate,lAdresse,salaire,dateEmbauche);
    }

    /**
     * This function ajust the secretary's salary by adding 0.1% by manager she has affected to her.
     */
    public void calculSalaireSecretaire(){
        int employerListSize = this.managers.size();
        double raise = 0.1 * employerListSize;
        this.augmenterLeSalaire(raise);
    }

    /**
     * Getter for the List of Managers
     * @return managers - ArrayList<Manager>
     */
    public ArrayList<Manager> getManagers(){ return this.managers; }

    /**
     * Ajoute un un Manager a liste de manager de la secretaire
     * @param manager
     */
    public void addManager(Manager manager){
        if(this.managers.size() < 5){
            this.managers.add(manager);
            calculSalaireSecretaire();
        } else {
            System.out.println("Cette secrétaire a déja 5 Manager affectés");
        }
    }

    /**
     * Retire un manager de la liste de manager de la secretaire
     * @param manager
     */
    public void delManager(Manager manager){
        this.managers.remove(manager);
    }

    /**
     * Override the equals pour la classe Secretaire
     * @param obj
     * @return
     */
    @Override
	public boolean equals(Object obj) {
		boolean res = false;
		if (obj == null || getClass() != obj.getClass()) res = false;
		else {
			if (this == obj) return true;
			Secretaire s = (Secretaire) obj;
			if (this.getNom() == s.getNom() && this.getPrenom() == s.getPrenom() && this.getDateNaissance().equals(s.getDateNaissance())) res = true;
		}
		return res;
	}
}
