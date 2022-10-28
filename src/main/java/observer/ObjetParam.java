package observer;

import figureObservable.Figure;

public interface ObjetParam {
    void addFigure(Figure figure);
    void removeFig(Figure figure);
    void notifyFig();

}
