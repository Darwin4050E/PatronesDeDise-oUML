package ec.edu.espol.Colecciones;

import ec.edu.espol.Iteradores.Iterador;
import ec.edu.espol.Iteradores.IteradorFallo;
import ec.edu.espol.Iteradores.IteradorReparacion;
import ec.edu.espol.Iteradores.IteradorTienda;
import ec.edu.espol.Iteradores.IteradorWeb;

public class Productos implements Inventario{

    private String elemento = "Soy un producto ";

    public String getEtiqueta(){
        return this.elemento;
    }

    @Override
    public Iterador crearIteradorWeb(String elemento) {
        return new IteradorWeb(this);
    }

    @Override
    public Iterador crearIteradorTienda(String elemento) {
        return new IteradorTienda(this);
    }

    @Override
    public Iterador crearIteradorFallo(String elemento) {
        return new IteradorFallo(this);
    }

    @Override
    public Iterador crearIteradorReparacion(String elemento) {
        return new IteradorReparacion(this);
    }


}
