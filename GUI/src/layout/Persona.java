package layout;

public class Persona {
	//Atributos
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private Ciudad ciudad;
	/**
	 * Constructor 1
	 * 
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param telefono
	 * @param ciudad
	 */
	public Persona(String nombre, String apellido, String direccion, Ciudad ciudad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}
	/**
	 * Constructor 2
	 * 
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param telefono
	 */
	public Persona(String nombre, String apellido, String direccion,
			String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	//getter y setter
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}	
}