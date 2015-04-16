package proyecto.vistas;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PantallaInicio extends JPanel {

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
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 800, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
	}
}
