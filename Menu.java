
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNombre;
	private JTextField txtEquipo;
	private JTextField txtNumGoles;
	private JTextField txtNumAutogoles;
	private JTextField txtNumPases;



	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 913, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 879, 379);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblID = new JLabel("ID:");
		lblID.setBounds(54, 10, 79, 13);
		panel.add(lblID);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(54, 51, 111, 13);
		panel.add(lblNombre);
		
		JLabel lblEquipo = new JLabel("Equipo:");
		lblEquipo.setBounds(54, 91, 96, 13);
		panel.add(lblEquipo);
		
		JLabel lblNgoles = new JLabel("Numero de Goles:");
		lblNgoles.setBounds(54, 131, 111, 13);
		panel.add(lblNgoles);
		
		JLabel lblNagoles = new JLabel("Numero de Autogoles:");
		lblNagoles.setBounds(54, 174, 144, 13);
		panel.add(lblNagoles);
		
		JLabel lblNpases = new JLabel("Numero de pases:");
		lblNpases.setBounds(54, 217, 111, 13);
		panel.add(lblNpases);
		
		txtID = new JTextField();
		txtID.setBounds(242, 7, 96, 19);
		panel.add(txtID);
		txtID.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(242, 48, 96, 19);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEquipo = new JTextField();
		txtEquipo.setBounds(242, 88, 96, 19);
		panel.add(txtEquipo);
		txtEquipo.setColumns(10);
		
		txtNumGoles = new JTextField();
		txtNumGoles.setBounds(242, 128, 96, 19);
		panel.add(txtNumGoles);
		txtNumGoles.setColumns(10);
		
		txtNumAutogoles = new JTextField();
		txtNumAutogoles.setBounds(242, 171, 96, 19);
		panel.add(txtNumAutogoles);
		txtNumAutogoles.setColumns(10);
		
		txtNumPases = new JTextField();
		txtNumPases.setBounds(242, 214, 96, 19);
		panel.add(txtNumPases);
		txtNumPases.setColumns(10);
		
		JButton btnIngresarD = new JButton("Crear Futbolista");
		btnIngresarD.setBounds(48, 312, 132, 21);
		panel.add(btnIngresarD);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(205, 312, 122, 21);
		panel.add(btnBuscar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(784, 312, 85, 21);
		panel.add(btnSalir);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(354, 312, 144, 21);
		panel.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(537, 312, 149, 21);
		panel.add(btnEliminar);

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				int id = Integer.parseInt(txtID.getText());
				GestionArchivo.buscarJugadorEspecifico("Futbolistas.txt", id);
			}
		});

		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				int id = Integer.parseInt(txtID.getText());
				GestionArchivo.eliminarObj("Futbolistas.txt", id);
			}
		});

		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				int id = Integer.parseInt(txtID.getText());
				String nombre = txtNombre.getText();

				int numGoles = Integer.parseInt(txtNumGoles.getText());

				
				GestionArchivo.modificarObj("Futbolistas.txt", id,nombre,numGoles);
			}
		});

		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				Menu.this.dispose();
			}
		});

		btnIngresarD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(txtID.getText());
				String nombre = txtNombre.getText();
				String equipo = txtEquipo.getText();
				int numGoles = Integer.parseInt(txtNumGoles.getText());
				int numAutoGoles = Integer.parseInt(txtNumAutogoles.getText());
				int numPases = Integer.parseInt(txtNumPases.getText());

				Futbolista nf= new Futbolista(id, nombre, equipo, numGoles, numAutoGoles, numPases);
				OpcionesC c = new OpcionesC(nf);
				c.setVisible(true); // Mostrar la ventana Menu
				Menu.this.dispose();
				
				// Aquí puedes usar los valores obtenidos para lo que necesites
			}
		});
		


	}
}
