package dessin;

import figureObservable.Figure;
import traitement.StrategyTraitement;

import java.util.ArrayList;
import java.util.List;

public class Dessin {

    private List<Figure> figureList = new ArrayList<Figure>();
    protected StrategyTraitement strategyTraitement;

    public void effectuerTraitement(){
        strategyTraitement.traiter();
    }

    public void setStrategyTraitement(StrategyTraitement strategyTraitement){
        this.strategyTraitement = strategyTraitement;
    }

    public void ajouterFig(Figure figure){

    }
    public void suppFig(Figure figure){

    }

    public void displayFigs(){

    }

    public void serialize(Figure fig){

    }

}
