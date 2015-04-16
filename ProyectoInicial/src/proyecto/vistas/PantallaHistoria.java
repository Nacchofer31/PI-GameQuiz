package proyecto.vistas;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PantallaHistoria extends JPanel {
	
	public PantallaHistoria() {
		setLayout(null);
		
		Image iLetrasHistoria = new ImageIcon(this.getClass().getResource("/LetrasHistoria.png")).getImage();
		JLabel labelLetrasHistoria = new JLabel("/LetrasHistoria.png");
		labelLetrasHistoria.setBounds(-416, -25, 757, 205);
		labelLetrasHistoria.setIcon(new ImageIcon(iLetrasHistoria));
		add(labelLetrasHistoria);
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 800, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		

		
	}
}
