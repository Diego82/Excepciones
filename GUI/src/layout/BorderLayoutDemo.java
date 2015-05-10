package layout;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;


public class BorderLayoutDemo {
	private JFrame ventana;
	
	public BorderLayoutDemo(){
		ventana = new JFrame("Titulo de la ventana");
		//ventana.setTitle("Titulo");
		ventana.setSize(300, 200);
		//ventana.setSize(new Dimension(300,200));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		BorderLayout miLayout = new BorderLayout(30,30);
		ventana.getContentPane().setLayout(miLayout);
		
		JLabel etiqueta = new JLabel("Mi etiqueta");
		ventana.getContentPane().add(etiqueta, BorderLayout.NORTH);
		
		JButton boton = new JButton("Boton");
		boton.setPreferredSize(new Dimension(150, 70));
		ventana.getContentPane().add(boton,BorderLayout.WEST);
		
		JTextPane txtpnSdfsdf = new JTextPane();
		txtpnSdfsdf.setText("Hola amigo");
		txtpnSdfsdf.setPreferredSize(new Dimension(100, 21));
		ventana.getContentPane().add(txtpnSdfsdf, BorderLayout.EAST);
		
		
	}
	public static void main(String[] args) {
		BorderLayoutDemo app = new BorderLayoutDemo();
	}
}