package vista;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;

public class Decada10 extends JPanel {
	
	public Decada10() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);
		
		JLabel lblDecada = new JLabel("DECADA");
		lblDecada.setForeground(Color.RED);
		lblDecada.setBounds(10, 68, 84, 41);
		add(lblDecada);
		
		
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(27, 0, 1600, 591);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		

	}
}
