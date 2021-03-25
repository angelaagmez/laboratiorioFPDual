package ejercicios;

public class Cliente {
	private String nombre;
	private String dni;
	private double presupuesto;
	private int edad;
	private String sexo;
	
	public Cliente(String nombre, String dni, double presupuesto, int edad, String sexo) {
		this.nombre = nombre;
		this.dni = dni;
		this.presupuesto = presupuesto;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void saludar() {
		System.out.println("Hola que tal");
	}

	public void despedirse() {
		System.out.println("Adios");
	}
	
	public void comprar(double gastado) {
		presupuesto -= gastado;
		System.out.println("Te quedan(€): "+presupuesto);
		
		
	}
	
	public void presentarse() {
		System.out.println("Mi nombre es "+nombre+" y tengo "+edad+" años");
	}
	
	public boolean comprobarSexo(String sexo2) {
		if(sexo.equalsIgnoreCase(sexo2)) {
			return true;
		}
			return false;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}


