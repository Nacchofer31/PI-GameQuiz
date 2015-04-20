package vista;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PantallaHistoria extends JPanel {
	
	public PantallaHistoria() {
		setLayout(null);
		
		Image iLetrasHistoria = new ImageIcon(this.getClass().getResource("/LetrasHistoria.png")).getImage();
		JLabel labelLetrasHistoria = new JLabel("/LetrasHistoria.png");
		labelLetrasHistoria.setBounds(452, 36, 357, 175);
		labelLetrasHistoria.setIcon(new ImageIcon(iLetrasHistoria));
		add(labelLetrasHistoria);
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1600, 591);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		

		
	}
}
