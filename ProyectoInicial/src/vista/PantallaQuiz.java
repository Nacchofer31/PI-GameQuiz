package vista;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PantallaQuiz extends JPanel {

	public PantallaQuiz() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");	
		imgFondo.setBounds(27, 0, 1600, 591);;
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);

	}

}
