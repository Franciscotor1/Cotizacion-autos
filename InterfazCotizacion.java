import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazCotizacion {
    private JTextField txtNumCotizacion;
    private JTextField txtDescripcion;
    private JTextField txtPrecio;
    private JTextField txtPorcentajePagoInicial;
    private JTextField txtPlazo;
    private JButton btnMostrarCotizacion;

    public InterfazCotizacion() {
        JFrame frame = new JFrame("Cotización Automóvil");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        txtNumCotizacion = new JTextField(10);
        txtDescripcion = new JTextField(10);
        txtPrecio = new JTextField(10);
        txtPorcentajePagoInicial = new JTextField(10);
        txtPlazo = new JTextField(10);
        btnMostrarCotizacion = new JButton("Mostrar Cotización");

        btnMostrarCotizacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCotizacion();
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Num Cotizacion:"));
        panel.add(txtNumCotizacion);
        panel.add(new JLabel("Descripcion:"));
        panel.add(txtDescripcion);
        panel.add(new JLabel("Precio:"));
        panel.add(txtPrecio);
        panel.add(new JLabel("Porcentaje Pago Inicial:"));
        panel.add(txtPorcentajePagoInicial);
        panel.add(new JLabel("Plazo:"));
        panel.add(txtPlazo);

        frame.add(panel);
        frame.add(btnMostrarCotizacion);

        frame.setVisible(true);
    }

    private void mostrarCotizacion() {
        int numCotizacion = Integer.parseInt(txtNumCotizacion.getText());
        String descripcion = txtDescripcion.getText();
        double precio = Double.parseDouble(txtPrecio.getText());
        double porcentajePagoInicial = Double.parseDouble(txtPorcentajePagoInicial.getText());
        int plazo = Integer.parseInt(txtPlazo.getText());

        CotizacionAutomovil cotizacion = new CotizacionAutomovil(numCotizacion, descripcion, precio, porcentajePagoInicial, plazo);
        cotizacion.mostrarCotizacion();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfazCotizacion();
            }
        });
    }
}
