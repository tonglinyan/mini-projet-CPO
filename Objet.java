package miniprojet;

import java.awt.*;

public abstract class Objet {
	
	public int hauteur;
	public int largeur;
	public int posx;
	public int posy;
	public int vitesse;
	
	public Objet(int h, int l, int x, int y, int v) {
		this.hauteur = h;
		this.largeur = l;
		this.posx = x;
		this.posy = y;
		this.vitesse = v;
	}
	
	public Rectangle getRectangle() {
		return new Rectangle(posx, posy, largeur, hauteur);
	}
	
	public int getposx() {
		return this.posx;
	}
	
	public int getposy() {
		return this.posy;
	}
	
	public abstract void bouger(char direc, int dim);
	
	public int getvitesse() {
		return this.vitesse;
	}
	
}
