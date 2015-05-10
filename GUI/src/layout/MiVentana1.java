package layout;

import java.awt.Dimension;

import javax.swing.*;
import java.awt.BorderLayout;

public class MiVentana1 {

	public void creaGUI(){
		JFrame ventana = new JFrame();
		//Definimos el titulo de la ventana
		ventana.setTitle("Mi primera ventana");
		ventana.setSize(300, 200);
		//ventana.setSize(new Dimension(300,200));
		
		//Definimos el comportamiento del boton de cerrar
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(100,200));
		ventana.setResizable(false);
		
		JButton miBoton = new JButton();
		miBoton.setText("que haces\n");
		ventana.getContentPane().add(miBoton);
		
		JButton botonEste = new JButton("hola");
		ventana.getContentPane().add(botonEste, BorderLayout.EAST);
		
		JButton botonSur = new JButton("eeeehh");
		ventana.getContentPane().add(botonSur, BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
		MiVentana1 app = new MiVentana1();
		app.creaGUI();
	}
}