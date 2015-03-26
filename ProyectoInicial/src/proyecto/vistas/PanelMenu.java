package proyecto.vistas;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;

public class PanelMenu extends JPanel {
	
	JPanel upPanel,downPanel;
	JButton btn,btn2,btn3,btn4,btn5,btn6;
	private JPanel downPanel1,downPanel2,downPanel3,downPanel4,downPanel5;
	private JLabel lblPrimeraPantalla,lblSegundaPantalla,lblCuartaPantalla,lblTerceraPantalla,lblQuintaPantalla;	
	
	
	public PanelMenu() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		/**
		 * PANEL DE MENÚ DE OPCIONES SUPERIOR
		 */
		upPanel = new JPanel();
		add(upPanel);
		
		/**
		 * BOTONES
		 */
		
		//Boton1
		btn = new JButton("Inicio");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)downPanel.getLayout();
				c.show(downPanel, "Panel1");
			}
		});
		upPanel.setLayout(new MigLayout("", "[57px][69px][67px][57px][75px][77px]", "[23px]"));
		upPanel.add(btn, "cell 0 0,alignx left,aligny center");
		
		
		//Boton2
		btn2 = new JButton("Historia");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)downPanel.getLayout();
				c.show(downPanel, "Panel2");
			}
		});
		upPanel.add(btn2, "cell 1 0,alignx left,aligny center");
		
		
		//Boton3
		btn3 = new JButton("Juegos");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)downPanel.getLayout();
				c.show(downPanel, "Panel3");
			}
		});
		upPanel.add(btn3, "cell 2 0,alignx left,aligny center");
		
		
		//Boton4
		btn4 = new JButton("Quiz!");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)downPanel.getLayout();
				c.show(downPanel, "Panel4");
			}
		});
		upPanel.add(btn4, "cell 3 0,alignx left,aligny center");
		
		
		//Boton5
		btn5 = new JButton("Cat\u00E1logo");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)downPanel.getLayout();
				c.show(downPanel, "Panel5");
			}
		});
		upPanel.add(btn5, "cell 4 0,alignx left,aligny center");
		
		
		//Boton6
		btn6 = new JButton("Opciones");
		upPanel.add(btn6, "cell 5 0,alignx left,aligny center");
		
		
		
		/**
		 * PANEL DE CONTENIDO DEL APLICATIVO
		 */
		downPanel = new JPanel();
		add(downPanel);
		downPanel.setLayout(new CardLayout(0, 0));
		
		downPanel1 = new JPanel();
		downPanel.add(downPanel1, "Panel1");
		downPanel1.setLayout(null);
		
		lblPrimeraPantalla = new JLabel("Te encuentras en la pantalla de Inicio");
		lblPrimeraPantalla.setBounds(39, 11, 241, 39);
		downPanel1.add(lblPrimeraPantalla);
		
		downPanel2 = new JPanel();
		downPanel.add(downPanel2, "Panel2");
		downPanel2.setLayout(null);
		
		lblSegundaPantalla = new JLabel("Te encuentras en la pantalla de Historia de Videojuegos");
		lblSegundaPantalla.setBounds(39, 11, 340, 39);
		downPanel2.add(lblSegundaPantalla);
		
		downPanel3 = new JPanel();
		downPanel.add(downPanel3, "Panel3");
		downPanel3.setLayout(null);
		
		lblTerceraPantalla = new JLabel("Te encuentras en la p\u00E1gina Juegos");
		lblTerceraPantalla.setBounds(50, 25, 230, 14);
		downPanel3.add(lblTerceraPantalla);
		
		downPanel4 = new JPanel();
		downPanel.add(downPanel4, "Panel4");
		downPanel4.setLayout(null);
		
		lblCuartaPantalla = new JLabel("Te encuentras en la pantalla de Quiz!");
		lblCuartaPantalla.setBounds(46, 24, 278, 14);
		downPanel4.add(lblCuartaPantalla);
		
		downPanel5 = new JPanel();
		downPanel.add(downPanel5, "Panel5");
		downPanel5.setLayout(null);
		
		lblQuintaPantalla = new JLabel("Te encuentras en la pantalla de Cat\u00E1logo");
		lblQuintaPantalla.setBounds(60, 32, 259, 14);
		downPanel5.add(lblQuintaPantalla);

	}
}
