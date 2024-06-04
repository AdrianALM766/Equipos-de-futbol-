import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Jdefensa extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNtackles;
    private JTextField txtNpp;

    public Jdefensa(Futbolista futbolista) {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbNtackles = new JLabel("Numero Tackles:");
        lbNtackles.setBounds(50, 50, 100, 30);
        contentPane.add(lbNtackles);

        txtNtackles = new JTextField();
        txtNtackles.setBounds(160, 50, 100, 30);
        contentPane.add(txtNtackles);
        txtNtackles.setColumns(10);

        JLabel lblNpp = new JLabel("Penalties Defendidos:");
        lblNpp.setBounds(50, 100, 120, 30);
        contentPane.add(lblNpp);

        txtNpp = new JTextField();
        txtNpp.setBounds(180, 100, 100, 30);
        contentPane.add(txtNpp);
        txtNpp.setColumns(10);

        JButton btnTerminar = new JButton("Terminar");
        btnTerminar.setBounds(150, 150, 100, 30);
        contentPane.add(btnTerminar);

    btnTerminar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                int Ntackles = Integer.parseInt(txtNtackles.getText());
                int Npp = Integer.parseInt(txtNpp.getText());
                Defensa aux = new Defensa(futbolista.getID(), futbolista.getNombre(), futbolista.getEquipo(),
                        futbolista.getNumeroGoles(), futbolista.getNumeroAutoGoles(), futbolista.getNumeroPases(),
                        Ntackles, Npp);
                GestionArchivo.crearArchivo("Futbolistas.txt");
                GestionArchivo.insertarEnArchivo("Futbolistas.txt", aux);
                System.out.println(aux.toString());
                Menu menu = new Menu();
                menu.setVisible(true); // Mostrar la ventana Menu
                Jdefensa.this.dispose();
            } catch (NumberFormatException ex) {
                // Manejar la excepción si el texto no puede ser convertido a número
                // Por ejemplo, mostrar un mensaje de error al usuario
                JOptionPane.showMessageDialog(Jdefensa.this, "Ingrese un valor numérico válido para goles tapados y penalties tapados", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });


    }
}