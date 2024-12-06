package ec.edu.espol.Iteradores;

import java.util.Random;

import ec.edu.espol.Colecciones.Productos;

public class IteradorTienda implements Iterador{

    private Random estadoIteracion = new Random();
    private Productos productos;

    public IteradorTienda(Productos productos){
        this.productos = productos;
    }
    
    @Override
    public String obtenerSiguiente(){
        return productos.getEtiqueta() + "de la tienda física.";
    }

    @Override
    public boolean tieneMas(){
        return estadoIteracion.nextBoolean();
    }

}
