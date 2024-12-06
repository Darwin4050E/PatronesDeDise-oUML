package ec.edu.espol.Iteradores;

import java.util.Random;

import ec.edu.espol.Colecciones.Productos;

public class IteradorFallo implements Iterador{

    private Random estadoIteracion = new Random();
    private Productos productos;

    public IteradorFallo(Productos productos){
        this.productos = productos;
    }

    @Override
    public String obtenerSiguiente(){
        return productos.getEtiqueta() + "con fallos.";
    }

    @Override
    public boolean tieneMas(){
        return estadoIteracion.nextBoolean();
    }

}
