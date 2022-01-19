package EX01;

import javax.swing.JFrame;

public class Fenetre extends JFrame{
	public Fenetre() {
		super("fenetre");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String [] args) {
		new Fenetre();
	}

}
