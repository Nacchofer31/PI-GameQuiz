package proyecto.vistas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.SystemColor;

public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;
	PantallaInicio pI= new PantallaInicio();
	PantallaHistoria pH= new PantallaHistoria();
	PantallaConsolas pC= new PantallaConsolas();
	PantallaJuegos pJ= new PantallaJuegos();
	PantallaQuiz pQ= new PantallaQuiz();
	PantallaOpciones pO= new PantallaOpciones();	
	
	public PantallaPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 800, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// JPanel para las pantallas
		JPanel panelPantallas = new JPanel();
		panelPantallas.setBounds(0, 105, 795, 467);
		contentPane.add(panelPantallas);
		this.setResizable(false);
		panelPantallas.setLayout(new CardLayout(0, 0));

				
		panelPantallas.add(pI,"PanelInicio");
			pI.setLayout(null);
				
		panelPantallas.add(pH,"PanelHistoria");
			pH.setLayout(null);
		
		panelPantallas.add(pC,"PanelConsolas");
			pC.setLayout(null);
		
		panelPantallas.add(pJ,"PanelJuegos");
			pJ.setLayout(null);
		
		panelPantallas.add(pQ,"PanelQuiz");
			pQ.setLayout(null);
		
		panelPantallas.add(pO,"PanelOpciones");
			pO.setLayout(null);
		
		// JPanel para los botones
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(0, 0, 795, 85);
		contentPane.add(panelBotones);
		panelBotones.setLayout(null);
		
		// Boton Inicio
		JButton btnInicio = new JButton("Inicio");
		btnInicio.setIcon(new ImageIcon("C:\\Users\\Nach\\git\\PI-GameQuiz\\ProyectoInicial\\imgs\\home.png"));
		btnInicio.setFont(new Font("Courgette", Font.PLAIN, 19));
		btnInicio.setForeground(new Color(255, 0, 0));
		btnInicio.setOpaque(false);
		btnInicio.setContentAreaFilled(false);
		btnInicio.setBorderPainted(false);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelInicio");
			}
		});
		
		Image imgHeader = new ImageIcon(this.getClass().getResource("/MuroPiedras.png")).getImage();
		btnInicio.setBounds(94, 34, 128, 28);
		panelBotones.add(btnInicio);
		
		//Boton Historia
		JButton btnHistoria = new JButton("Historia");
		btnHistoria.setIcon(new ImageIcon("C:\\Users\\Nach\\git\\PI-GameQuiz\\ProyectoInicial\\imgs\\book.png"));
		btnHistoria.setFont(new Font("Courgette", Font.PLAIN, 19));
		btnHistoria.setForeground(new Color(255, 0, 0));
		btnHistoria.setOpaque(false);
		btnHistoria.setContentAreaFilled(false);
		btnHistoria.setBorderPainted(false);
		btnHistoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelHistoria");
			}
		});
		btnHistoria.setBounds(204, 30, 153, 36);
		panelBotones.add(btnHistoria);
		
		//Boton Consolas
		JButton btnConsolas = new JButton("Consolas");
		btnConsolas.setIcon(new ImageIcon("C:\\Users\\Nach\\git\\PI-GameQuiz\\ProyectoInicial\\imgs\\consoles.png"));
		btnConsolas.setFont(new Font("Courgette", Font.PLAIN, 19));
		btnConsolas.setForeground(new Color(255, 0, 0));
		btnConsolas.setOpaque(false);
		btnConsolas.setContentAreaFilled(false);
		btnConsolas.setBorderPainted(false);
		btnConsolas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelConsolas");
			}
		});
		btnConsolas.setBounds(336, 30, 153, 36);
		panelBotones.add(btnConsolas);
		
		//Boton Juegos
		JButton btnJuegos = new JButton("Juegos");
		btnJuegos.setIcon(new ImageIcon("C:\\Users\\Nach\\git\\PI-GameQuiz\\ProyectoInicial\\imgs\\games.png"));
		btnJuegos.setFont(new Font("Courgette", Font.PLAIN, 19));
		btnJuegos.setForeground(new Color(255, 0, 0));
		btnJuegos.setOpaque(false);
		btnJuegos.setContentAreaFilled(false);
		btnJuegos.setBorderPainted(false);
		btnJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelJuegos");
			}
		});
		btnJuegos.setBounds(452, 34, 146, 28);
		panelBotones.add(btnJuegos);
		
		//Boton Quiz
		JButton btnQuiz = new JButton("Quiz");
		btnQuiz.setIcon(new ImageIcon("C:\\Users\\Nach\\git\\PI-GameQuiz\\ProyectoInicial\\imgs\\thumbs.png"));
		btnQuiz.setFont(new Font("Courgette", Font.PLAIN, 19));
		btnQuiz.setForeground(new Color(255, 0, 0));
		btnQuiz.setOpaque(false);
		btnQuiz.setContentAreaFilled(false);
		btnQuiz.setBorderPainted(false);
		btnQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelQuiz");
			}
		});
		btnQuiz.setBounds(561, 28, 146, 41);
		panelBotones.add(btnQuiz);
		
		//Boton Opciones
		JButton btnOpciones = new JButton("");
		btnOpciones.setIcon(new ImageIcon("C:\\Users\\Nach\\git\\PI-GameQuiz\\ProyectoInicial\\imgs\\settings.png"));
		btnOpciones.setFont(new Font("Courgette", Font.PLAIN, 19));
		btnOpciones.setForeground(new Color(255, 0, 0));
		btnOpciones.setOpaque(false);
		btnOpciones.setContentAreaFilled(false);
		btnOpciones.setBorderPainted(false);
		btnOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelOpciones");
			}
		});
		btnOpciones.setBounds(696, 28, 89, 53);
		panelBotones.add(btnOpciones);
		
		//Logo GameQuiz
		Image imgLogo = new ImageIcon(this.getClass().getResource("/LogoDef.png")).getImage();
		JLabel logo = new JLabel("");
		logo.setBounds(23, 1, 80, 84);
		logo.setIcon(new ImageIcon(imgLogo));
		panelBotones.add(logo);
		JLabel header = new JLabel("");
		header.setBounds(0, 0, 795, 85);
		panelBotones.add(header);
		header.setIcon(new ImageIcon(imgHeader));
		
		//MARCO BAJO BOTONES SOBRE PANTALLA
		JPanel panel = new JPanel();
		panel.setBounds(0, 84, 794, 23);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
	}
}
