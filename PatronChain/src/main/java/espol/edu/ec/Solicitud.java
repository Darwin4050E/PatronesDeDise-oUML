package espol.edu.ec;

public interface Solicitud {
    public void setNext(Solicitud h);
    public void iniciarProceso(String description);
    public boolean esPosible();
}
