package ec.edu.espol.Colecciones;

import ec.edu.espol.Iteradores.Iterador;

public interface Inventario {

    Iterador crearIteradorWeb(String elemento);
    Iterador crearIteradorTienda(String elemento);
    Iterador crearIteradorFallo(String elemento);
    Iterador crearIteradorReparacion(String elemento);

}
