package espol.edu.ec;

import java.time.LocalDate;

public class Producto {
    private int precio;
    private LocalDate garantia;
    
    public Producto(int precio, LocalDate garantia) {
        this.precio = precio;
        this.garantia = garantia;
    }

    public int getPrecio() {
        return precio;
    }

    public LocalDate getGarantia() {
        return garantia;
    }
    
    



}
