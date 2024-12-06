package ec.edu.espol;

import ec.edu.espol.estrategias.*;

public class Logistica {
    public static void main(String[] args) {
        EstrategiaDistribucion estrategiaAutomotriz = new EstrategiaAutomotriz();
        LogisticaDistribucion distribucion = new LogisticaDistribucion(estrategiaAutomotriz);
        distribucion.distribuirArticulos();

        EstrategiaDistribucion estrategiaFluvial = new EstrategiaFluvial();
        distribucion.setEstrategiaDistribucion(estrategiaFluvial);
        distribucion.distribuirArticulos();
    }
}

