package test;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private Gaulois[] villageois;
	private Chef chef;
	
	

	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		villageois=new Gaulois[nbVillageoisMaximum];
	}

	public String getNom() {
		return nom;
	}
	public void setChef(Chef chef) {
		this.chef=chef;
	}
	public void ajouterHabitant(Gaulois Hab) {
		villageois[nbVillageois]=Hab;
		nbVillageois++;
	}
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans "+getNom()+" du chef "+chef.getNom()+" vivent les légendaires gaulois :");
		for(int i=0;i<nbVillageois;i++) {
			System.out.println("-"+trouverHabitant(i).getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village=new Village("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		Chef abraracourix=new Chef("Abraracourix",6,village);
		village.setChef(abraracourix);
		Gaulois asterix=new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
		Gaulois gaulois = village.trouverHabitant(0);
		System.out.println(gaulois);
		Gaulois obelix=new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}

