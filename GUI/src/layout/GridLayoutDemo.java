package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class GridLayoutDemo {

	private JFrame frame;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Persona p = new Persona("Diego", "Torres", "Av Andalucia", Ciudad.Almería);
					GridLayoutDemo window = new GridLayoutDemo(p);
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
	public GridLayoutDemo(Persona p) {
		initialize(p);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Persona p) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 20, 15));
		
		JLabel Apellidos = new JLabel("Nombre");
		frame.getContentPane().add(Apellidos);
		
		textNombre = new JTextField();
		textNombre.setText(p.getNombre());
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel Nombre = new JLabel("Apellido");
		frame.getContentPane().add(Nombre);
		
		textApellido = new JTextField();
		textApellido.setText(p.getApellido());
		frame.getContentPane().add(textApellido);
		textApellido.setColumns(10);
		
		JLabel Direccion = new JLabel("Direccion");
		frame.getContentPane().add(Direccion);
		
		textDireccion = new JTextField();
		textDireccion.setText(p.getDireccion());
		frame.getContentPane().add(textDireccion);
		textDireccion.setColumns(10);
		
		JLabel Localidad = new JLabel("Localidad");
		frame.getContentPane().add(Localidad);
		
		JComboBox<Ciudad> comboBox = new JComboBox<Ciudad>();
		comboBox.setModel(new DefaultComboBoxModel<Ciudad>(Ciudad.values()));
		frame.getContentPane().add(comboBox);
		
		JButton boton1 = new JButton("Aceptar");
		frame.getContentPane().add(boton1);
		
		JButton boton2 = new JButton("Cancelar");
		frame.getContentPane().add(boton2);
	}

}