package figureObservable;

import observer.ObjetParam;
import observer.ParamImpl;

public abstract class Figure {
    public abstract void update(ParamImpl param);
    public abstract double calculSurface();
    public abstract double calculPerim();
    private ObjetParam objetParam;
    public abstract void displayFigs();

    public ObjetParam getObjetParam() {
        return objetParam;
    }

    public void setObjetParam(ObjetParam objetParam) {
        this.objetParam = objetParam;
    }

}
