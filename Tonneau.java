package miniprojet;

public class Tonneau extends Objet{
	
	public Tonneau(int h, int l, int x, int y, int v, double n, double t){
		super(h, l, x, y, v);
	}

	public void bouger(char direc, int dim) {
		if (!this.disparition()) {
			this.posy -= this.vitesse;
		}
	}
	
	public boolean disparition(){
		return (this.posy < 0);
	}
}
