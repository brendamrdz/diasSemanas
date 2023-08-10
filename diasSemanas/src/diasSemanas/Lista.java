package diasSemanas;
import java.util.*; // import the ArrayList class
public class Lista {
	
	Integer dia;
	String nombre;
	ArrayList<String> diasSemana = new ArrayList<String>(); // Create an ArrayList object
	
	public Lista(Integer dia2, String nombre2){
		this.dia = dia2;
		this.nombre = nombre2;
		System.out.println("lista"+this.dia);
	 }
	
	public void agregar() {
		diasSemana.add("Lunes");
		diasSemana.add("Martes");
		diasSemana.add("Miercoles");
		diasSemana.add("Jueves");
		diasSemana.add("Viernes");
		System.out.println(diasSemana);
		System.out.println("lista"+this.dia);
	}
	
	public void iterador() {
		Iterator<String> iter = diasSemana.iterator();
		while(iter.hasNext())
		{
		  System.out.println("Dia de la semana: " + iter.next());
		}
	}
	
	public void eliminarElemento() {
		diasSemana.remove("Jueves");
		System.out.println(diasSemana);
		
	}
	
	public void eliminarElementoElegido(String dato) {
		diasSemana.remove(dato);
		System.out.println(diasSemana);
	
	}
}
 