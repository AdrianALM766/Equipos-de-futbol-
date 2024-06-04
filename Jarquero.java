import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Jarquero extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtGolesTapados;
    private JTextField txtPenaltiesTapados;

    public Jarquero(Futbolista futbolista) {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblGolesTapados = new JLabel("Goles Tapados:");
        lblGolesTapados.setBounds(50, 50, 100, 30);
        contentPane.add(lblGolesTapados);

        txtGolesTapados = new JTextField();
        txtGolesTapados.setBounds(160, 50, 100, 30);
        contentPane.add(txtGolesTapados);
        txtGolesTapados.setColumns(10);

        JLabel lblPenaltiesTapados = new JLabel("Penalties Tapados:");
        lblPenaltiesTapados.setBounds(50, 100, 120, 30);
        contentPane.add(lblPenaltiesTapados);

        txtPenaltiesTapados = new JTextField();
        txtPenaltiesTapados.setBounds(180, 100, 100, 30);
        contentPane.add(txtPenaltiesTapados);
        txtPenaltiesTapados.setColumns(10);

        JButton btnTerminar = new JButton("Terminar");
        btnTerminar.setBounds(150, 150, 100, 30);
        contentPane.add(btnTerminar);

    btnTerminar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                int golesT = Integer.parseInt(txtGolesTapados.getText());
                int penalties = Integer.parseInt(txtPenaltiesTapados.getText());
                Arquero aux = new Arquero(futbolista.getID(), futbolista.getNombre(), futbolista.getEquipo(),
                        futbolista.getNumeroGoles(), futbolista.getNumeroAutoGoles(), futbolista.getNumeroPases(),
                        golesT, penalties);
                GestionArchivo.crearArchivo("Futbolistas.txt");
                GestionArchivo.insertarEnArchivo("Futbolistas.txt", aux);
                System.out.println(aux.toString());
                Menu menu = new Menu();
                menu.setVisible(true); // Mostrar la ventana Menu
                Jarquero.this.dispose();
            } catch (NumberFormatException ex) {
                // Manejar la excepción si el texto no puede ser convertido a número
                // Por ejemplo, mostrar un mensaje de error al usuario
                JOptionPane.showMessageDialog(Jarquero.this, "Ingrese un valor numérico válido para goles tapados y penalties tapados", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });


    }
}
