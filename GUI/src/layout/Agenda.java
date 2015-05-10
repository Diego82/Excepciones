package layout;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	List<Persona> agenda;

	/**
	 * @param lista
	 */
	public Agenda() {
		agenda = new ArrayList<Persona>();
	}
	
	public void addPersona(Persona p){
		agenda.add(p);
	}
	public Persona getAgenda(int i){
		return agenda.get(i);
	}
	public void rellenarAgenda(){
		Persona p1 = new Persona("Diego", "Torres", "Av Andalucia", "43333333");
		Persona p2 = new Persona("David", "Perez", "Av Madrid", "34224634");
		Persona p3 = new Persona("Miguel", "Torres", "Av Granada", "433673453");
		Persona p4 = new Persona("Pedro", "Sanches", "Av Cordobba", "46754283");
	}
	public int getSize(){
		return agenda.size();
	}
}