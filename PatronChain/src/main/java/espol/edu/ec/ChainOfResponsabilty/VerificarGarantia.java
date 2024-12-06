package espol.edu.ec.ChainOfResponsabilty;

import espol.edu.ec.Producto;
import espol.edu.ec.SolicitudDeCambio;

public class VerificarGarantia extends SolicitudDeCambio {

    public VerificarGarantia(Producto p){   
        super(p);
    }

    @Override
    public void iniciarProceso(String description) {
        if(esPosible()){
            System.out.println("proceso activo: "+description);
            System.out.println("Asistente de departamento verificando la garantía del producto...");
        
            avanzarSiguienteProceso(description);
        } else {
            // En caso de que la acción no se haya realizado.
            System.out.println("Producto no apto para devolución");
        }
    }

    @Override
    public boolean esPosible() {
        // Codigo para ejecutar si la acción se puede realizar
        return true;
    }

    private void avanzarSiguienteProceso(String description){
        if(this.next != null){
            next.iniciarProceso(description);
        } else{
            System.out.println("Proceso terminado.");
            System.out.println("Producto listo para para el cambio");
        }
    }

    
}
