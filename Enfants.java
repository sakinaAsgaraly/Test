package cadeauPack;
import java.util.List;
public class Enfants {
	private String prenom;
	private int note_comportement;
	private String preference;
	private List<Cadeaux>cadeaux;
	private int age;
	private int budget_enfant;
	private int nb_cadeaux;
	private String categorieReelle;
	




public Enfants() {
	super();	
}

public Enfants (String prenom,int note_comportement,String preference, int age){
	super();
	this.prenom = prenom;
	this.note_comportement = note_comportement;
	this.preference = preference;
	this.age = age;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public int getNote_comportement() {
	return note_comportement;
}

public void setNote_comportement(int note_comportement) {
	this.note_comportement = note_comportement;
}

public String getPreference() {
	return preference;
}

public void setPreference(String preference) {
	this.preference = preference;
}

public List<Cadeaux> getCadeaux() {
	return cadeaux;
}

public void setCadeaux(List<Cadeaux> cadeaux) {
	this.cadeaux = cadeaux;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getBudget_enfant() {
	return budget_enfant;
}

public void setBudget_enfant(int budget_enfant) {
	this.budget_enfant = budget_enfant;
}

public int getNb_cadeaux() {
	return nb_cadeaux;
}

public void setNb_cadeaux(int nb_cadeaux) {
this.nb_cadeaux = nb_cadeaux;
}

public String getCategorieReelle() {
	return categorieReelle;
}

public void setCategorieReelle(String categorieReelle) {
	this.categorieReelle = categorieReelle;
}


}
