import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUsuario;
	private JTextField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public App() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 406, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 372, 453);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(46, 24, 70, 19);
		panel.add(lblUsuario);

		JLabel lblPassword = new JLabel("PassWord:");
		lblPassword.setBounds(46, 70, 85, 13);
		panel.add(lblPassword);

		textUsuario = new JTextField();
		textUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		textUsuario.setBounds(170, 24, 149, 19);
		panel.add(textUsuario);
		textUsuario.setColumns(10);

		textPassword = new JTextField();
		textPassword.setHorizontalAlignment(SwingConstants.LEFT);
		textPassword.setBounds(170, 67, 149, 19);
		panel.add(textPassword);
		textPassword.setColumns(10);

		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(46, 277, 85, 53);
		panel.add(btnIngresar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(215, 277, 85, 53);
		panel.add(btnSalir);

		// logica de salir
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// logica de ingresar
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textUsuario.getText();
				int password = Integer.parseInt(textPassword.getText());
				User Us = new User(name, password);
				GestionArchivo.crearArchivo("Users.txt");
				GestionArchivo.insertarEnArchivo("Users.txt", Us);

				Menu menu = new Menu();
				menu.setVisible(true); // Mostrar la ventana Menu
				App.this.dispose();

			}
		});

	}
}
