package ec.edu.espol.Iteradores;

import java.util.Random;

import ec.edu.espol.Colecciones.Productos;

public class IteradorWeb implements Iterador{
    
    private Random estadoIteracion = new Random();
    private Productos productos;

    public IteradorWeb(Productos productos){
        this.productos = productos;
    }

    @Override
    public String obtenerSiguiente(){
        return productos.getEtiqueta() + "de la tienda web.";
    }

    @Override
    public boolean tieneMas(){
        return estadoIteracion.nextBoolean();
    }

}
