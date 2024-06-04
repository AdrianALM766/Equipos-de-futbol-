import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Jdelantero extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNgolesPartido;
    private JTextField txtPosicion;

    public Jdelantero(Futbolista futbolista) {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbNgolesPartido = new JLabel("Numero Goles Partido:");
        lbNgolesPartido.setBounds(50, 50, 120, 30);
        contentPane.add(lbNgolesPartido);

        txtNgolesPartido = new JTextField();
        txtNgolesPartido.setBounds(180, 50, 100, 30);
        contentPane.add(txtNgolesPartido);
        txtNgolesPartido.setColumns(10);

        JLabel lblPosicion = new JLabel("Posición:");
        lblPosicion.setBounds(50, 100, 100, 30);
        contentPane.add(lblPosicion);

        txtPosicion = new JTextField();
        txtPosicion.setBounds(160, 100, 100, 30);
        contentPane.add(txtPosicion);
        txtPosicion.setColumns(10);

        JButton btnTerminar = new JButton("Terminar");
        btnTerminar.setBounds(150, 150, 100, 30);
        contentPane.add(btnTerminar);

        btnTerminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int NgolesPartido = Integer.parseInt(txtNgolesPartido.getText());
                    String posicion = txtPosicion.getText();
                    Delantero aux = new Delantero(futbolista.getID(), futbolista.getNombre(), futbolista.getEquipo(),
                            futbolista.getNumeroGoles(), futbolista.getNumeroAutoGoles(), futbolista.getNumeroPases(),
                            NgolesPartido, posicion);
                    GestionArchivo.crearArchivo("Futbolistas.txt");
                    GestionArchivo.insertarEnArchivo("Futbolistas.txt", aux);
                    System.out.println(aux.toString());
                    Menu menu = new Menu();
                    menu.setVisible(true); // Mostrar la ventana Menu
                    Jdelantero.this.dispose();
                } catch (NumberFormatException ex) {
                    // Manejar la excepción si el texto no puede ser convertido a número
                    // Por ejemplo, mostrar un mensaje de error al usuario
                    JOptionPane.showMessageDialog(Jdelantero.this, "Ingrese un valor numérico válido para goles por partido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}

