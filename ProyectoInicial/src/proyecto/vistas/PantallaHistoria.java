package proyecto.vistas;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PantallaHistoria extends JPanel {
	JLabel lblPantallaHistoria;
	JLabel imgFondo;

	/**
	 * Create the panel.
	 */
	public PantallaHistoria() {
		setLayout(null);
	
		lblPantallaHistoria = new JLabel("");
		lblPantallaHistoria.setBounds(10, 29, 154, 14);
		add(lblPantallaHistoria);

		
	}
}
