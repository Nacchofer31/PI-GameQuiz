package vista;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaHistoria extends JPanel {
	
	public PantallaHistoria() {

		setLayout(null);
		setBounds(0, 105, 1355, 591);
		
		//Letras
		Image iLetrasHistoria = new ImageIcon(this.getClass().getResource("/LetrasHistoria.png")).getImage();
		JLabel labelLetrasHistoria = new JLabel("/LetrasHistoria.png");
		labelLetrasHistoria.setBounds(63, 110, 357, 175);
		labelLetrasHistoria.setIcon(new ImageIcon(iLetrasHistoria));
		add(labelLetrasHistoria);
		
		
		
		//Boton Decada 70
		JButton button70 = new JButton("70's");
		button70.setBounds(63, 432, 58, 23);
		add(button70);
		
		//Boton Decada 80
		JButton button80 = new JButton("80's");
		button80.setBounds(131, 432, 58, 23);
		add(button80);
		
		//Boton Decada 90
		JButton button90 = new JButton("90's");
		button90.setBounds(199, 432, 58, 23);
		add(button90);
		
		//Boton Decada 00's
		JButton button00 = new JButton("00's");
		button00.setBounds(267, 432, 58, 23);
		add(button00);
		
		//Boton Decada 10's
		JButton button10 = new JButton("10's");
		button10.setBounds(335, 432, 58, 23);
		add(button10);
		
		//Label elige
		JLabel lblElige = new JLabel("Elige la década que quieras leer");
		lblElige.setForeground(Color.WHITE);
		lblElige.setFont(new Font("BatangChe", Font.BOLD, 20));
		lblElige.setBounds(63, 366, 365, 33);
		add(lblElige);
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1600, 591);
		imgFondo.setIcon(new ImageIcon(iFondo));
		add(imgFondo);
		
	}

}
