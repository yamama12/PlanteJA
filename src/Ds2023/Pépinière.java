package Ds2023;

public class Pépinière {
	private int MaxPlantes=1000;
	private Plante inventaire[]=new Plante[MaxPlantes];
	private int nombreDePlantes ;
		
	

	public void ajoutPlante(Plante plante) {
			if (this.nombreDePlantes<this.MaxPlantes) {
				inventaire[nombreDePlantes]=plante;
				nombreDePlantes++;
			}
	}
	
	public void afficherInventaire() {
		for (int i=0;i<nombreDePlantes;i++) {
			inventaire[i].description();
			if(inventaire[i] instanceof Fleur) {
				((Fleur) inventaire[i]).fleurir() ;
			}
		}
	}
	
	public double totalAbsorptionTotaleCO2() {
		double k=0;
		for (int i=0;i<this.nombreDePlantes;i++) {
			if (inventaire[i] instanceof Arbre) {
				k+= ((Arbre) inventaire[i]).absorpationCO2();
			}
			
		}
		return k;
	}
	
	public int compterArbresCaduques() {
		int count=0;
		for (int i=0;i<this.nombreDePlantes;i++) {
			if (inventaire[i] instanceof Arbre && ((Arbre) inventaire[i]).getType_Feuillage().equalsIgnoreCase("caduque")) {
				count ++;
			}
		}
		return count ;
	}
	

}
