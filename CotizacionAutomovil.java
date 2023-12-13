import javax.swing.*;

public class CotizacionAutomovil {
    private int numCotizacion;
    private String descripcion;
    private double precio;
    private double porcentajePagoInicial;
    private int plazo;

    public CotizacionAutomovil(int numCotizacion, String descripcion, double precio, double porcentajePagoInicial, int plazo) {
        this.numCotizacion = numCotizacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.porcentajePagoInicial = porcentajePagoInicial;
        this.plazo = plazo;
    }

    public void mostrarCotizacion() {
        double totalFinanciar = precio - (precio * (porcentajePagoInicial / 100));
        double pagoMensual = totalFinanciar / plazo;

        String mensaje = "Num Cotizacion: " + numCotizacion + "\n" +
                         "Descripcion: " + descripcion + "\n" +
                         "Precio: " + precio + "\n" +
                         "Porcentaje Pago Inicial: " + porcentajePagoInicial + "%\n" +
                         "Plazo: " + plazo + " meses\n\n" +
                         "Calculos:\n" +
                         "Total a financiar: " + totalFinanciar + "\n" +
                         "Pago Mensual: " + pagoMensual;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
