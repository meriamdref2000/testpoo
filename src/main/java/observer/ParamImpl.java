package observer;


import figureObservable.Figure;

import java.util.ArrayList;
import java.util.List;

public class ParamImpl implements ObjetParam {
    private double epaisseur;
    private String couleurContour;
    private String couleurRemplissage;
    private List<Figure> figureList;

    public ParamImpl() {
        this.figureList = new ArrayList<Figure>();
    }

    public void addFigure(Figure figure) {
        figureList.add(figure);
    }

    public void removeFig(Figure figure) {
        int figureId = figureList.indexOf(figure);// Do i have this figure?
        if (figureId >= 0){
            figureList.remove(figureId);
        }

    }

    public void notifyFig() {
        for(Figure observer: figureList) {
            observer.update(this);
        }

    }

    public double getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(double epaisseur) {
        this.epaisseur = epaisseur;
    }

    public String getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(String couleurContour) {
        this.couleurContour = couleurContour;
    }

    public String getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(String couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
    }

    public List<Figure> getFigureList() {
        return figureList;
    }

    public void setFigureList(List<Figure> figureList) {
        this.figureList = figureList;
    }
}
