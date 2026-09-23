package EX;

public class Cercle {
	public Point centre;
	public double rayon;
	public String couleur="noir";
	public static int nbrCercles=0;
	public Cercle() {
		centre = new Point();
		rayon=1;
		nbrCercles++;
	}
	public Cercle(Point centre,double rayon) {
		this.centre=centre;
		this.rayon=rayon;
		nbrCercles++;
	}
	public Cercle(double x,double y,double rayon,String couleur) {
		this.centre=new Point(x,y);
		this.rayon=rayon;
		this.couleur=couleur;
		nbrCercles++;
	}
	public void mon_etat() {
		System.out.println("Cercle[centre=(" + centre.abscisse + "," + centre.ordonnee + "), rayon=" + rayon + ", couleur=" + couleur + "]");
    }
	public double getSurface() {
		return Math.PI*rayon*rayon;
	}
	public double getPerimetre() {
		return 2*rayon*Math.PI;
	}
	public void deplacer(double dx,double dy) {
		centre.abscisse = centre.abscisse + dx; 
		centre.ordonnee = centre.ordonnee + dy;
	}
	public void deplacer(Point nouveauCentre) {
		centre = nouveauCentre;
	}
	public boolean contient(Point p) {
		return centre.distance(p) <= rayon;
	}
	public boolean estPlusGrandQue(Cercle autre) {
		return this.rayon>autre.rayon;
	}
	public static int getNbrCercles() {
		return nbrCercles;
	}

}
