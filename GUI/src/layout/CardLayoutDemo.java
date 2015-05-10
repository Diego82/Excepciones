package layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutDemo {

	private JFrame frame;
	CardLayout cardLayout;
	JPanel cards;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutDemo window = new CardLayoutDemo();
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
	public CardLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//establecemos el layout del frame a BorderLayout
		BorderLayout miLayout = new BorderLayout();
		frame.getContentPane().setLayout(miLayout);
		
		//Creamos un boton
		JButton boton1 = new JButton("Siguiente");
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.next(cards);
			}
		});
		JButton boton2 = new JButton("Anterior");
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.previous(cards);
			}
		});
		
		//Creamos el panel
		JPanel panelNorte = new JPanel();
		BoxLayout boxLayout = new BoxLayout(panelNorte, BoxLayout.X_AXIS);
		
		panelNorte.setLayout(boxLayout);
		
		panelNorte.add(boton1);
		panelNorte.add(boton2);
		
		//Insertamos panel en zona norte del jframe
		frame.getContentPane().add(panelNorte, BorderLayout.NORTH);
		
		/* Si añadimos en la misma zona solo se vera uno
		frame.add(boton1, BorderLayout.NORTH);
		frame.add(boton2, BorderLayout.NORTH);*/
		
		
		cards = new JPanel();
		cardLayout = new CardLayout();
		cards.setLayout(cardLayout);
		
		JPanel panel1 = new JPanel();
		JLabel etiqueta1 = new JLabel("Este es el panel 1");
		panel1.add(etiqueta1);
				
		JPanel panel2 = new JPanel();
		JLabel etiqueta2 = new JLabel("Este es el panel 2");
		panel2.add(etiqueta2);
		
		JPanel panel3 = new JPanel();
		JLabel etiqueta3 = new JLabel("Este es el panel 3");
		JButton botonPanel3 = new JButton("Boton");
		botonPanel3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.dispose();
				etiqueta3.setText("Cambio el texto de la etiqueta");
			}
		});
		panel3.add(botonPanel3);
		panel3.add(etiqueta3);
		
		
		cards.add(panel1);
		cards.add(panel2);
		cards.add(panel3);
		
		frame.getContentPane().add(cards, BorderLayout.CENTER);
		
	}

}