package test;

public enum Equipement {
	CASQUE("casque"), BOUCLIER("bouclier");

	String nom;

	private Equipement(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}
}
