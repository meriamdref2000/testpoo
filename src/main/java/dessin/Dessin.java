package dessin;

import figureObservable.Figure;
import traitement.StrategyTraitement;

import java.util.ArrayList;
import java.util.List;

public class Dessin {

    private List<Figure> figureList = new ArrayList<Figure>();
    protected StrategyTraitement strategyTraitement = new StrategyTraitement() {
        @Override
        public void traiter() {
            System.out.println("traitement");
        }
    };

    public void effectuerTraitement(){
        strategyTraitement.traiter();
    }

    public void setStrategyTraitement(StrategyTraitement strategyTraitement){
        this.strategyTraitement = strategyTraitement;
    }

    public void ajouterFig(Figure figure){
        figureList.add(figure);

    }
    public void suppFig(Figure figure){
        int figureId = figureList.indexOf(figure);// Do i have this figure?
        if (figureId >= 0){
            figureList.remove(figureId);
        }
    }

    public void displayFigs(){
        for (Figure figure: figureList)
            figure.displayFigs();
    }

    public void serialize(Figure fig){

    }

}
