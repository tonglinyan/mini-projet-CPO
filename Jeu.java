package miniprojet;

import java.util.*;

public class Jeu {	
	static int hauteurP;
	static int largeurP;
	static int posxP;
	static int posyP;
	static int vitesseP;
	
	static int hauteurN;
	static int largeurN;
	static int posxN;
	static int posyN;
	static int vitesseN;
	static double probaTombe = 0.4;
	static double probaApparition = 0.5;
	
	static int hauteurT;
	static int largeurT;
	static int posxT;
	static int posyT;
	static int vitesseT;
	
	ArrayList<Nuage> nuages;
	ArrayList<Tonneau> tonneaux;
	Personnage personnage = new Personnage(hauteurP, largeurP, posxP, posyP, vitesseP);
	
	public static void main(String[] args) {
		
		
		
	}
}
