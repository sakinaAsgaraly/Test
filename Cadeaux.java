package cadeauPack;

public class Cadeaux {
	private String categorie;
	private int prix;
	
public Cadeaux() {
	super();
}

public Cadeaux (String categorie,int prix ){
	super();
	this.categorie = categorie;
	this.prix = prix;
}

public String getCategorie() {
	return categorie;
}

public void setCategorie(String categorie) {
	this.categorie = categorie;
}

public int getPrix() {
	return prix;
}

public void setPrix(int prix) {
	this.prix = prix;
}

}
