package test;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void preparerPotion() {
		Random random = new Random();
		forcePotion = effetPotionMin + random.nextInt(effetPotionMax - effetPotionMin + 1);
		if (forcePotion >= 7) {
			parler("J'ai préparé une super potion de force " + forcePotion);
		} else {
			parler("« Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
		}

	}

	public void booster(Gaulois obelix) {
		if (obelix.getNom().equals("Obélix")) {
			parler("Non Obélix !... tu n'auras pas de potion magique !");
		} else {
			obelix.boirePotion(forcePotion);
		}

	}

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
		Gaulois gaulois = new Gaulois("Phélipé", 6);
		Romain titus = new Romain("Titus", 7);
		titus.sEquiper(Equipement.CASQUE);
		gaulois.frapper(titus);
		panoramix.booster(gaulois);
		// gaulois.frapper(titus);

	}
}