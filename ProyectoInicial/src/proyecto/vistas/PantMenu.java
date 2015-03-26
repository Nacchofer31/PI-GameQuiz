package proyecto.vistas;



import javax.swing.JFrame;
import javax.swing.JPanel;


public class PantMenu extends JFrame {

	private JPanel contentPane;
	PanelMenu pM= new PanelMenu();


	/**
	 * Create the frame.
	 */
	public PantMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 800, 600);
		setContentPane(pM);
		this.setResizable(false);
	}

}
