package EX;

public class Point {
	public double abscisse,ordonnee;
	public String couleur ="noir"; 
    public Point() {
    	
    }
    public Point(double abscisse,double ordonnee) {
    	this.abscisse=abscisse;
    	this.ordonnee=ordonnee;
    }
    public void mon_etat() {
    	System.out.println("Abscisse= "+abscisse+" Ordonnee= "+ordonnee+" Couleur= "+couleur);
    }
    public double distance(Point p) {
    	this.abscisse=p.abscisse;
    	this.ordonnee=p.ordonnee;
    	return Math.sqrt((this.abscisse-p.abscisse)*(this.abscisse-p.abscisse)+(this.ordonnee-p.ordonnee)*(this.ordonnee-p.ordonnee));
    }
}
