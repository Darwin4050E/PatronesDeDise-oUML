package espol.edu.ec;

import java.time.LocalDate;

import espol.edu.ec.ChainOfResponsabilty.AprobacionGerente;
import espol.edu.ec.ChainOfResponsabilty.CertificarExistencia;
import espol.edu.ec.ChainOfResponsabilty.ComprobarDatosGarantia;
import espol.edu.ec.ChainOfResponsabilty.ValidarPrecioVenta;
import espol.edu.ec.ChainOfResponsabilty.VerificarGarantia;

public class Main {
    public static void main(String[] args) {
        Producto product = new Producto(1200, LocalDate.of(2025, 1, 25));

        SolicitudDeCambio primerProceso = new VerificarGarantia(product);
        SolicitudDeCambio segundoProceso = new ComprobarDatosGarantia(product);
        SolicitudDeCambio tercerProceso = new CertificarExistencia(product);
        SolicitudDeCambio cuartoProceso = new ValidarPrecioVenta(product);
        SolicitudDeCambio quintoProceso = new AprobacionGerente(product);

        primerProceso.setNext(segundoProceso);
        segundoProceso.setNext(tercerProceso);
        tercerProceso.setNext(cuartoProceso);
        cuartoProceso.setNext(quintoProceso);

        primerProceso.iniciarProceso("Cambio de producto");
    }
}