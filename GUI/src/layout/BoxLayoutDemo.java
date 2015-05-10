package layout;

import java.awt.EventQueue;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoxLayoutDemo window = new BoxLayoutDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BoxLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout miBoxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		frame.getContentPane().setLayout(miBoxLayout);
		JButton boton1 = new JButton("Boton 1");
		frame.getContentPane().add(boton1);
		JButton boton2 = new JButton("Boton 2");
		frame.getContentPane().add(boton2);
		JButton boton3 = new JButton("Boton 3");
		frame.getContentPane().add(boton3);
		
	}

}