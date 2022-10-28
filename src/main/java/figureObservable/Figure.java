package figureObservable;

import observer.ObjetParam;
import observer.ParamImpl;

public abstract class Figure {
    public abstract void update(ParamImpl param);
    public abstract double calculSurface();
    private ObjetParam objetParam;

    public ObjetParam getObjetParam() {
        return objetParam;
    }

    public void setObjetParam(ObjetParam objetParam) {
        this.objetParam = objetParam;
    }
}
