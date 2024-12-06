package ec.edu.espol;

import ec.edu.espol.Colecciones.Productos;
import ec.edu.espol.Iteradores.Iterador;

public class Main {
    public static void main(String[] args) {
        
        Productos p1 = new Productos();
        Iterador i1 = p1.crearIteradorWeb("Soy un producto");
        
        while(i1.tieneMas()){
            System.out.println(i1.obtenerSiguiente());
        }

    }
}

