package proyecto.vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;
	PantallaInicio pI= new PantallaInicio();
	PantallaHistoria pH= new PantallaHistoria();
	PantallaConsolas pC= new PantallaConsolas();
	PantallaJuegos pJ= new PantallaJuegos();
	PantallaQuiz pQ= new PantallaQuiz();
	PantallaOpciones pO= new PantallaOpciones();
	
	
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
		panelPantallas.setBounds(0, 43, 794, 529);
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
		panelBotones.setBounds(0, 0, 794, 43);
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
		btnInicio.setBounds(10, 11, 89, 23);
		panelBotones.add(btnInicio);
		
		//Boton Historia
		JButton btnHistoria = new JButton("Historia");
		btnHistoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelHistoria");
			}
		});
		btnHistoria.setBounds(109, 11, 89, 23);
		panelBotones.add(btnHistoria);
		
		//Boton Consolas
		JButton btnConsolas = new JButton("Consolas");
		btnConsolas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelConsolas");
			}
		});
		btnConsolas.setBounds(208, 11, 89, 23);
		panelBotones.add(btnConsolas);
		
		//Boton Juegos
		JButton btnJuegos = new JButton("Juegos");
		btnJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelJuegos");
			}
		});
		btnJuegos.setBounds(307, 11, 89, 23);
		panelBotones.add(btnJuegos);
		
		//Boton Quiz
		JButton btnQuiz = new JButton("Quiz");
		btnQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelQuiz");
			}
		});
		btnQuiz.setBounds(406, 11, 89, 23);
		panelBotones.add(btnQuiz);
		
		//Boton Opciones
		JButton btnOpciones = new JButton("Opciones");
		btnOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelOpciones");
			}
		});
		btnOpciones.setBounds(505, 11, 89, 23);
		panelBotones.add(btnOpciones);
		
		
	}
}
