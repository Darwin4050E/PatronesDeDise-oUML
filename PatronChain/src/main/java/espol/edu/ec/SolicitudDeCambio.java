package espol.edu.ec;

public abstract class SolicitudDeCambio implements Solicitud {
    protected Solicitud next;
    protected Producto product;
    
    public SolicitudDeCambio(Producto product){
        this.product = product;
    }

    @Override
    public void setNext(Solicitud h) {
        this.next = h;
    }

    @Override
    public abstract void iniciarProceso(String description);

    @Override
    public abstract boolean esPosible();

}
