package Ds2023;

public class Arbre extends Plante {
	private String type_Feuillage;
	private final int AbsorMoyenne=22;
	public Arbre(String nom, double hauteur, int age, double prix, String type_Feuillage) {
		super(nom, hauteur, age, prix);
		this.type_Feuillage = type_Feuillage;
	}
	
	public String getType_Feuillage() {
		return type_Feuillage;
	}
	
	@Override
	public String toString() {
		return "Arbre [type_Feuillage=" + type_Feuillage + ", AbsorMoyenne=" + AbsorMoyenne + "]";
	}

	public void description () {
		System.out.println(super.toString());
		System.out.println(this.toString());
	}
	
	public double absorpationCO2() {
		if (super.hauteur>50) {
			return (AbsorMoyenne+3);
		}
		else {
			return this.AbsorMoyenne;
		}
	}
}
