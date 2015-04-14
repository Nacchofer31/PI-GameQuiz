package proyecto.vistas;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PantallaQuiz extends JPanel {
	private JTextField txtPantallaQuiz;

	/**
	 * Create the panel.
	 */
	public PantallaQuiz() {
		setLayout(null);
		
		txtPantallaQuiz = new JTextField();
		txtPantallaQuiz.setText("Pantalla Quiz");
		txtPantallaQuiz.setBounds(10, 11, 86, 20);
		add(txtPantallaQuiz);
		txtPantallaQuiz.setColumns(10);

	}

}
