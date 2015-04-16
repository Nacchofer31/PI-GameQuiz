package proyecto.vistas;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;
	PantallaInicio pI= new PantallaInicio();
	PantallaHistoria pH= new PantallaHistoria();
	PantallaConsolas pC= new PantallaConsolas();
	PantallaJuegos pJ= new PantallaJuegos();
	PantallaQuiz pQ= new PantallaQuiz();
	PantallaOpciones pO= new PantallaOpciones();
	JLabel imgFondo;	
	
	/**
	 * Create the frame.
	 */
	public PantallaPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 800, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// JPanel para las pantallas
		JPanel panelPantallas = new JPanel();
		panelPantallas.setBounds(0, 105, 795, 465);
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 795, 465);
		contentPane.add(lblNewLabel);
		
		// JPanel para los botones
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(0, 0, 795, 85);
		contentPane.add(panelBotones);
		panelBotones.setLayout(null);
		
		// Boton Inicio
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelInicio");
			}
		});
		btnInicio.setBounds(113, 25, 89, 23);
		panelBotones.add(btnInicio);
		
		//Boton Historia
		JButton btnHistoria = new JButton("Historia");
		btnHistoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelHistoria");
			}
		});
		btnHistoria.setBounds(212, 25, 89, 23);
		panelBotones.add(btnHistoria);
		
		//Boton Consolas
		JButton btnConsolas = new JButton("Consolas");
		btnConsolas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelConsolas");
			}
		});
		btnConsolas.setBounds(311, 25, 89, 23);
		panelBotones.add(btnConsolas);
		
		//Boton Juegos
		JButton btnJuegos = new JButton("Juegos");
		btnJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelJuegos");
			}
		});
		btnJuegos.setBounds(410, 25, 89, 23);
		panelBotones.add(btnJuegos);
		
		//Boton Quiz
		JButton btnQuiz = new JButton("Quiz");
		btnQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelQuiz");
			}
		});
		btnQuiz.setBounds(509, 25, 89, 23);
		panelBotones.add(btnQuiz);
		
		//Boton Opciones
		JButton btnOpciones = new JButton("Opciones");
		btnOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelOpciones");
			}
		});
		btnOpciones.setBounds(608, 25, 89, 23);
		panelBotones.add(btnOpciones);
		
		//Logo GameQuiz
		Image imgLogo = new ImageIcon(this.getClass().getResource("/LogoDef.png")).getImage();
		JLabel logo = new JLabel("");
		logo.setBounds(10, 0, 80, 84);
		logo.setIcon(new ImageIcon(imgLogo));
		panelBotones.add(logo);
		
		//MARCO BAJO BOTONES SOBRE PANTALLA
		JPanel panel = new JPanel();
		panel.setBounds(0, 84, 794, 23);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 800, 465);
		imgFondo.setIcon(new ImageIcon(iFondo));
		pI.add(imgFondo);
	
	}
}
