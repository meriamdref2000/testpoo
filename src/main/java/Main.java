import dessin.Dessin;
import figureObservable.*;
import point.Point;
import traitement.TraitementImpl1;

public class Main {
    public static void main(String[] args) {
        Dessin dessin = new Dessin();
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        Cercle c1 = new Cercle();
        Cercle c2 = new Cercle();
        Cercle c3 = new Cercle();

        Groupe g1 = new Groupe();
        g1.addFigure(r2);
        g1.addFigure(c2);

        dessin.ajouterFig(r1);
        dessin.ajouterFig(c1);

        dessin.effectuerTraitement();
        dessin.setStrategyTraitement(new TraitementImpl1());
        dessin.effectuerTraitement();
        dessin.displayFigs();
    }
}
