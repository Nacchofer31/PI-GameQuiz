package proyecto.vistas;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PantallaJuegos extends JPanel {
	
	public PantallaJuegos() {
		setLayout(null);
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1600, 591);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);

	}
}
