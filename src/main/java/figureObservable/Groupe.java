package figureObservable;

import observer.ParamImpl;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure{
    List<Figure> figureList = new ArrayList<Figure>();

    public void update(ParamImpl param) {

    }

    public double calculSurface() {
        float sum = 0;
        for ( Figure figure : figureList )
            sum += figure.calculSurface();
        return sum;
    }

    public double calculPerim() {
        float sum = 0;
        for ( Figure figure : figureList )
            sum += figure.calculPerim();
        return sum;
    }

    public void displayFigs() {
        for ( Figure figure : figureList )
            figure.displayFigs();
        System.out.println("------------------");
    }

    public void addFigure(Figure figure){
        figureList.add(figure);
    }

    public void setFigures(List<Figure> figures) {
        this.figureList = figures;
    }

}
