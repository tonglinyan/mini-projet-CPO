package miniprojet;

public class Personnage extends Objet{
	
	private int score;
	
	public Personnage(int h, int l, int x, int y, int v) {
		super(h, l, x, y, v);
		this.score = 0;
	}
	
	public void bouger(char direc, int dim) {
		switch (direc){
		case 'd':
			{if (this.posx + this.largeur + this.vitesse < dim)
					this.posx += this.vitesse;
				}
		case 'q':
			{if (this.posx - this.vitesse > 0)
				this.posx -= this.vitesse;}
		}
	}
	
	public boolean contacte(Tonneau t) {
		return (this.posy + this.hauteur < t.getposy() && 
				((this.posx < t.getposx() && 
				this.posx + this.largeur > t.getposx()) || 
				(this.posx < t.getposx() &&
				this.posx + this.hauteur > t.getposx())));
	}
	
	public void calculScore() {
		this.score ++;
	}
}
