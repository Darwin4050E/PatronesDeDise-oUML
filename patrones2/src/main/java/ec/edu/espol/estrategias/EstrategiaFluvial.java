package ec.edu.espol.estrategias;

public class EstrategiaFluvial implements EstrategiaDistribucion{

    @Override
    public void ejecutar() {
        operacion();
    }

    public void operacion() {
        System.out.println("Ejecutando la estrategia fluvial");
    }

}
