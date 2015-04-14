package proyecto.vistas;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PantallaOpciones extends JPanel {
	private JTextField txtPantallaopciones;

	/**
	 * Create the panel.
	 */
	public PantallaOpciones() {
		setLayout(null);
		
		txtPantallaopciones = new JTextField();
		txtPantallaopciones.setText("PantallaOpciones");
		txtPantallaopciones.setBounds(10, 11, 94, 20);
		add(txtPantallaopciones);
		txtPantallaopciones.setColumns(10);

	}

}
