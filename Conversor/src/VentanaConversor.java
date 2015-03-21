import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JComboBox;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VentanaConversor extends JFrame {

	private JPanel conversorPane;
	private JTextField campo1,campo2;
	private JLabel titulo,valor1,valor2,mensaje,divisaLbl;
	private JButton convButton;
	private JComboBox divisaBox;
	private String[] divisas={"Pesos","Dolares","Yenes","Nor"};
	private String divisaSelec;

	/**
	 * Create the frame.
	 */
	public VentanaConversor() {
		setTitle("Eurocalculadora");
		
		//Definiendo características JFrame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		conversorPane = new JPanel();
		conversorPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(conversorPane);
		conversorPane.setLayout(null);
		
		campo1 = new JTextField();
		campo1.setBounds(201, 47, 193, 20);
		conversorPane.add(campo1);
		campo1.setColumns(10);
		
		titulo = new JLabel("CONVERSOR DE DIVISAS");
		titulo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		titulo.setBounds(10, 11, 183, 25);
		conversorPane.add(titulo);
		
		valor1 = new JLabel("Introduce el valor a convertir");
		valor1.setBounds(23, 50, 168, 14);
		conversorPane.add(valor1);
		
		convButton = new JButton("CONVERTIR");
		convButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					float euros;
					euros = Float.parseFloat(campo1.getText());
					
						if(euros>0){
							switch(divisaSelec){
							case "Pesos":
							campo2.setText(String.valueOf(euros*16.24));
							break;
							case "Dolares":
							campo2.setText(String.valueOf(euros*1.08));
							break;
							case "Yenes":
							campo2.setText(String.valueOf(euros*129.87));
							break;
							case "Nor":
							campo2.setText(String.valueOf(euros*8.68));
							break;
							}
							mensaje.setText("");
							}else{
							mensaje.setText("Introduce una cantidad mayor a 0");
							}
				}catch(Exception e){
					mensaje.setText("Error al introducir datos de entrada");
				}
				
				}
					
			
		});
		convButton.setBounds(201, 165, 104, 39);
		conversorPane.add(convButton);
		
		campo2 = new JTextField();
		campo2.setBounds(201, 215, 200, 20);
		conversorPane.add(campo2);
		campo2.setColumns(10);
		
		valor2 = new JLabel("Valor convertido");
		valor2.setBounds(88, 218, 104, 14);
		conversorPane.add(valor2);
		
		divisaLbl = new JLabel("");
		divisaLbl.setForeground(Color.BLUE);
		divisaLbl.setBounds(23, 97, 159, 20);
		conversorPane.add(divisaLbl);
		
		mensaje = new JLabel("");
		mensaje.setForeground(Color.RED);
		mensaje.setBounds(142, 133, 218, 20);
		conversorPane.add(mensaje);
		
		divisaBox = new JComboBox();
		divisaBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				System.out.println(divisaBox.getSelectedItem());
				divisaSelec= (String) divisaBox.getSelectedItem();
				divisaLbl.setText("Convertir a: "+divisaSelec);

			}
		});
		divisaBox.setBounds(201, 97, 110, 25);
		for(int i=0;i<divisas.length;i++){
			divisaBox.addItem(divisas[i]);
		}
		conversorPane.add(divisaBox);
		
		
		
	}

	
	
}



	
