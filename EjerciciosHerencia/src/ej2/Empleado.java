package ej2;

public class Empleado {
	protected String nombreCompleto;
	protected String cedula;
	protected int edad;
	protected boolean casado;
	protected double salario;
	
	public Empleado(String nombreCompleto, String cedula, int edad, boolean casado, double salario) {
		this.nombreCompleto = nombreCompleto;
		this.cedula = cedula;
		setEdad(edad);
		this.casado = casado;
		this.salario = salario;
	}

	public Empleado() {
		this("","",0,false,0.0);
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad>=18 && edad<=45) {
			this.edad = edad;
		} else {
			this.edad = 18;
		}
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void mostrarClasificacion() {
		if(this.edad<=21) {
			System.out.println("Principiante");
		} else if(this.edad>=22 && this.edad<=35) {
			System.out.println("Intermedio");
		} else {
			System.out.println("Senior");
		}
	}
	
	public double aumentarSalario(double porcentaje) {
		return salario += salario * porcentaje;
	}

	@Override
	public String toString() {
		return "Empleado [nombreCompleto=" + nombreCompleto + '\n'+", cedula=" + cedula +'\n'+ ", edad=" + edad +'\n'+ ", casado="
				+ casado +'\n'+ ", salario=" + salario + "]";
	}
	
	
	

}
