package proyecto.vistas;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class PantallaConsolas extends JPanel {

	public PantallaConsolas() {
		setLayout(null);
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1600, 591);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);

	}

}
