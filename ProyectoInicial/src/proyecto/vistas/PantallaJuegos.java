package proyecto.vistas;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PantallaJuegos extends JPanel {
	private JTextField txtPanta;
	
	/**
	 * Create the panel.
	 */
	public PantallaJuegos() {
		setLayout(null);
		
		txtPanta = new JTextField();
		txtPanta.setText("Pantalla Juegos");
		txtPanta.setBounds(10, 11, 86, 20);
		add(txtPanta);
		txtPanta.setColumns(10);

	}
}
