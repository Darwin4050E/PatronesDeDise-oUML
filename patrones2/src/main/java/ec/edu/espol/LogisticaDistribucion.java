package ec.edu.espol;

import ec.edu.espol.estrategias.EstrategiaDistribucion;

public class LogisticaDistribucion {
    private EstrategiaDistribucion estrategia;

    public LogisticaDistribucion(EstrategiaDistribucion estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategiaDistribucion(EstrategiaDistribucion estrategia) {
        this.estrategia = estrategia;
    }

    public void distribuirArticulos(){
        estrategia.ejecutar();
    }
}
