package ec.edu.espol.estrategias;

public class EstrategiaAutomotriz implements EstrategiaDistribucion{
    @Override
    public void ejecutar() {
        operacion();
    }

    public void operacion() {
        System.out.println("Ejecutando la estrategia automotriz");
    }
}
