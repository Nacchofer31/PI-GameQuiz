package proyecto.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class PantallaInicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public PantallaInicio() {
		setLayout(null);
		
		JLabel label = new JLabel("Pantalla Inicio");
		label.setBounds(10, 435, 131, 14);
		add(label);
		
		JLabel label_1 = new JLabel("Pantalla Inicio");
		label_1.setBounds(10, 11, 131, 14);
		add(label_1);
		
		JLabel label_2 = new JLabel("Pantalla Inicio");
		label_2.setBounds(689, 11, 107, 14);
		add(label_2);
		
		JLabel label_3 = new JLabel("Pantalla Inicio");
		label_3.setBounds(704, 435, 107, 14);
		add(label_3);

	}
}
