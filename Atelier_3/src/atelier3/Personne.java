package atelier3;

import java.util.*;

public class Personne{
    private static final Adresse ADRESSE_INCONNUE = null;
    public static int compteur = 0;
    private String nom;
    private String prenom;
    private final GregorianCalendar dateNaissance;
    private Adresse adresse=ADRESSE_INCONNUE;

	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
		compteur += 1;
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
	}

	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'année de naissance
	 * @param numero le n° de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
		compteur +=1;
	}

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le prénom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * @param return l'adresse
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}

	/**
	 * Accesseur
	 * @return le compteur d'instance
	 */
	public static int getCompteur() {
		return compteur;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"Prénom : "+prenom+"\n"+
		"Né(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
		"/"+dateNaissance.get(Calendar.MONTH)+
		"/"+dateNaissance.get(Calendar.YEAR)+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		if (obj == null || getClass() != obj.getClass()) {
			res = false;
		} else {
			if (this == obj) res = true;
			Personne p = (Personne) obj;
			if (this.getNom() == p.getNom() && this.getPrenom() == p.getPrenom() && this.getDateNaissance() == p.getDateNaissance()) {
				res = true;
			}
		}
		return res;
	}

	public static boolean older(Personne p1, Personne p2){
		GregorianCalendar p1Date = p1.getDateNaissance();
		GregorianCalendar p2Date = p2.getDateNaissance();
		if(p1Date.before(p2Date)){
			return true;
		} else {
			return false;
		}
	}
	public boolean older(Personne p){
		return older(this, p);
	}

}

   
   