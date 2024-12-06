package ec.edu.espol.Iteradores;

import java.util.Random;

import ec.edu.espol.Colecciones.Productos;

public class IteradorReparacion implements Iterador{

    private Random estadoIteracion = new Random();
    private Productos productos;

    public IteradorReparacion(Productos productos){
        this.productos = productos;
    }

    @Override
    public String obtenerSiguiente(){
        return productos.getEtiqueta() + "en reparación.";
    }

    @Override
    public boolean tieneMas(){
        return estadoIteracion.nextBoolean();
    }

}
