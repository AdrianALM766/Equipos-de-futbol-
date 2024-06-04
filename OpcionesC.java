
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class OpcionesC extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Futbolista futbolista;



    public OpcionesC(Futbolista futbolista) {
        this.futbolista = futbolista;
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnArquero = new JButton("Arquero");
        btnArquero.setBounds(50, 50, 100, 30);
        contentPane.add(btnArquero);

        JButton btnDefensa = new JButton("Defensa");
        btnDefensa.setBounds(50, 100, 100, 30);
        contentPane.add(btnDefensa);

        JButton btnDelantero = new JButton("Delantero");
        btnDelantero.setBounds(50, 150, 100, 30);
        contentPane.add(btnDelantero);

        btnArquero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Jarquero c = new Jarquero(futbolista);
				c.setVisible(true); // Mostrar la ventana Menu
				OpcionesC.this.dispose();
            }
        });

        btnDefensa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Jdefensa c = new Jdefensa(futbolista);
				c.setVisible(true); // Mostrar la ventana Menu
				OpcionesC.this.dispose();
            }
        });
        btnDelantero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Jdelantero c = new Jdelantero(futbolista);
				c.setVisible(true); // Mostrar la ventana Menu
				OpcionesC.this.dispose();
            }
        });

    }
}


