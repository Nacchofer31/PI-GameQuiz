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
				
		
		JLabel label = new JLabel("Pantalla Inicio");
		label.setBounds(10, 435, 131, 14);
		add(label);
		
		JLabel label_1 = new JLabel("Pantalla Inicio");
		label_1.setBounds(10, 11, 131, 14);
		add(label_1);
		
		JLabel label_3 = new JLabel("Pantalla Inicio");
		label_3.setBounds(704, 435, 107, 14);
		add(label_3);
		JLabel imgFondo = new JLabel("/Fondo.png");
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		
		JLabel label_2 = new JLabel("Pantalla Inicio");
		label_2.setBounds(1057, 11, 131, 14);
		add(label_2);
		imgFondo.setBounds(27, 0, 1600, 591);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		
		
		
	}
}
