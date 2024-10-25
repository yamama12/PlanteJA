package Ds2023;

public record Test() {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Péinière GREEN HANDS");
		Pépinière pepiniere=new Pépinière(); 
		Fleur rose = new Fleur(null, 30, 12, 15.99, "Rouge", 2);
		Fleur tulipe = new Fleur("Tulipe", 20, 8, 12.99, "Jaune", 4);
		Arbre chene = new Arbre ("Chene", 200, 60, 89.99, "caduque");
		Arbre sapin = new Arbre ("Sapin", 150 ,30, 59.99, "Persistant");
		rose.setNom("Rose");
		System.out.println("La "+ rose.getNom()+"a le couleur" + rose.getCouleur());
		pepiniere.ajoutPlante(rose);
		pepiniere.ajoutPlante(tulipe);
		pepiniere.ajoutPlante(chene);
		pepiniere.ajoutPlante(sapin);
		pepiniere.afficherInventaire();
		System.out.println("Total Absorption CO2 "+ pepiniere.totalAbsorptionTotaleCO2());
		System.out.println("Nombre d'arbres Caduques dans la pépinière : " +pepiniere.compterArbresCaduques());

	}

}
