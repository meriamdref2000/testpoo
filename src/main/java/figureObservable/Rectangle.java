package figureObservable;

import observer.ParamImpl;
import point.Point;

public class Rectangle extends Figure {
    private Point point;
    private double largeur;
    private double longueur;

    public void update(ParamImpl param) {

    }

    public double calculSurface() {
        return 2*(longueur+largeur);
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
}
