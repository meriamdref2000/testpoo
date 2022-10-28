package figureObservable;

import observer.ObjetParam;
import observer.ParamImpl;
import point.Point;

public class Cercle extends Figure {
    private Point centre;
    private double rayon;

    public void update(ParamImpl param) {
        this.setObjetParam(param);
        System.out.println("Cercle Updated Successfully");
        System.out.println(param);
    }

    public double calculSurface() {
        return 2*Math.PI*this.rayon;
    }

    public double calculPerim() {
        return Math.PI*this.rayon*this.rayon;
    }

    public void displayFigs() {
        System.out.println("ceci est un cercle");
    }


}
