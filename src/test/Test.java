package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello !");
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.parler("Je dis des choses intelligentes !");
		Romain titus = new Romain("Titus", 6);
		asterix.frapper(titus);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		titus.sEquiper(Equipement.BOUCLIER);
		titus.sEquiper(Equipement.BOUCLIER);
		titus.sEquiper(Equipement.CASQUE);
		titus.sEquiper(Equipement.CASQUE);
		asterix.frapper(titus);
		asterix.frapper(titus);
		asterix.frapper(titus);
		asterix.frapper(titus);
		asterix.frapper(titus);
		asterix.frapper(titus);
	}

}
