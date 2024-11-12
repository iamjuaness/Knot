package knot.factory;

import knot.model.Crossing;
import knot.model.DataKnot;

/**
 * Fábrica para crear diferentes tipos de nudos predefinidos
 */
public class KnotFactory {

    public static <T> DataKnot<T> createTrefoilKnot(T data1, T data2, T data3) {
        DataKnot<T> trefoil = new DataKnot<>();

        Crossing<T> c1 = trefoil.addCrossing(data1);
        Crossing<T> c2 = trefoil.addCrossing(data2);
        Crossing<T> c3 = trefoil.addCrossing(data3);

        trefoil.connect(c1, c2, true);
        trefoil.connect(c2, c3, true);
        trefoil.connect(c3, c1, true);

        c1.setCoordinates(0, 0);
        c2.setCoordinates(1, 1);
        c3.setCoordinates(-1, 1);

        return trefoil;
    }

    public static <T> DataKnot<T> createFigureEightKnot(T... data) {
        if (data.length < 4) {
            throw new IllegalArgumentException("Se requieren 4 elementos de datos para el nudo figura 8");
        }

        DataKnot<T> figureEight = new DataKnot<>();

        Crossing<T> c1 = figureEight.addCrossing(data[0]);
        Crossing<T> c2 = figureEight.addCrossing(data[1]);
        Crossing<T> c3 = figureEight.addCrossing(data[2]);
        Crossing<T> c4 = figureEight.addCrossing(data[3]);

        figureEight.connect(c1, c2, true);
        figureEight.connect(c2, c3, true);
        figureEight.connect(c3, c4, true);
        figureEight.connect(c4, c1, true);

        return figureEight;
    }
}
