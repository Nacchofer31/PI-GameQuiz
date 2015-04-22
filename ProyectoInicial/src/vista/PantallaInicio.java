package vista;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class PantallaInicio extends JPanel {

	public PantallaInicio() {
		setLayout(null);
		setBounds(0, 105, 1355, 591);
				
		
		//IMAGEN DE FONDO
		JLabel imgFondo = new JLabel("/Fondo.png");

		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		
		JLabel label_2 = new JLabel("Pantalla Inicio");
		label_2.setBounds(1057, 11, 131, 14);
		add(label_2);
		imgFondo.setBounds(27, 0, 1600, 591);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		
		
		
	}
}
