package controlVersiones;
/**
 * 
 * @author Alex Hurtado
 * @version Version 1, 2021
 * @since 24/05/2021
 *
 */
public class Empleado {
	/**
	 * <i>private String nombre</i>: es el nombre del empleado
	 * <i>private String apellidos</i>: son los apellidos del empleado
	 * <i>private double salario</i>: es el salario del empleado
	 */
	private String nombre;
	private String apellidos;
	private double salario;
	
	/**
	 * Constructor de la clase Empleado que recibe todos los atributos
	 * @param nombre nombre del empleado
	 * @param apellido apellidos del Empleado
	 * @param salario salario del empleado
	 */
	public Empleado(String nombre, String apellido, double salario) {
		this.nombre = nombre;
		this.apellidos = apellido;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	/**
	 * Método para subir el salario del empleado
	 * @param subida cantidad que se sube el salario del Empleado
	 */
	public void subirsalario(double subida) {
		salario = salario + subida;
	}
	//AÃ±adido desde GitHub
	public void bajarsalario(double bajada){
		salario = salario - bajada;	
	}

}
