package miniprojet;

public class Nuage extends Objet{

	private double apparition;
	private double tombe;
	private boolean tonneauTombe;
	
	public Nuage(int h, int l, int x, int y, int v, double n, double t) {
		super(h, l, x, y, v);
		this.apparition = n;
		this.tombe = t;
		this.tonneauTombe = false;
	}

	public boolean disparition(int dim) {
		return (this.posx + this.largeur + this.vitesse > dim);
	}

	public void bouger(char direc, int dim) {
		if (!this.disparition(dim))
			this.posx += this.vitesse;
	}
	
	public boolean apparaitre(){
		double d = Math.random();
		return (d < this.apparition);
	}

	public boolean tonneauTomber(int dim){
		if (this.posx + this.largeur + this.vitesse == dim && this.tonneauTombe == false) {
			this.tonneauTombe = true;
			return this.tonneauTombe;}
		else {
			double d = Math.random();
			this.tonneauTombe = (d < this.tombe);
			return this.tonneauTombe;
		}
	}
	
	
}
