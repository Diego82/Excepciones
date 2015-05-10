package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowLayoutDemo {
	JFrame ventana;
	FlowLayoutDemo(String titulo){
		ventana = new JFrame(titulo);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(300, 200);
		ventana.setVisible(true);
		
		JPanel panelCentral = new JPanel();
		JButton boton1 = new JButton("Boton1");
		JButton boton2 = new JButton("Boton2");
		JButton boton3 = new JButton("Boton3");
		JTextField textfield = new JTextField(40);
		JLabel etiqueta = new JLabel("etiqueta");
		
		panelCentral.add(boton1);
		panelCentral.add(boton2);
		panelCentral.add(boton3);
		panelCentral.add(textfield);
		panelCentral.add(etiqueta);
		
		ventana.add(panelCentral,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		new FlowLayoutDemo("Prueba Layout");
	}
}