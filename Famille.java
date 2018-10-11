package cadeauPack;
import java.util.List;

public class Famille {
private int nb_enfants;
private int budget_famille;
private List<Enfants> enfants;


public Famille() {
	super();
}

public Famille( int nb_enfants, int budget_famille/*, List<Enfants> enfants*/) {
	super();
	this.nb_enfants = nb_enfants;
	this.budget_famille = budget_famille;
	//this.enfants = enfants;
}

public int getNb_enfants() {
	return nb_enfants;
}

public void setNb_enfants(int nb_enfants) {
	this.nb_enfants = nb_enfants;
}

public int getBudget_famille() {
	return budget_famille;
}

public void setBudget_famille(int budget_famille) {
	this.budget_famille = budget_famille;
}

public List<Enfants> getEnfants() {
	return enfants;
}

public void setEnfants(List<Enfants> enfants) {
	this.enfants = enfants;
}

}
