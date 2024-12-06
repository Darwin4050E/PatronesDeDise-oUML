package espol.edu.ec.ChainOfResponsabilty;

import espol.edu.ec.Producto;
import espol.edu.ec.SolicitudDeCambio;

public class CertificarExistencia extends SolicitudDeCambio {

    public CertificarExistencia(Producto p){
        super(p);
    }

    @Override
    public void iniciarProceso(String description) {
        if(esPosible()){
            System.out.println("Comprobando existencia en bodega para su reposición...");
            
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
