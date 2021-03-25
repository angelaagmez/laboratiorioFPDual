package ej2;

public class Programador extends Empleado{
	private int lineaDeCodigoPorHora;
	private String lenguajeDominante;
	
	public Programador(String nombreCompleto, String cedula, int edad, boolean casado, double salario,
			int lineaDeCodigoPorHora, String lenguajeDominante) {
		super(nombreCompleto, cedula, edad, casado, salario);
		this.lineaDeCodigoPorHora = lineaDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}

	public Programador() {
		super();
		this.lineaDeCodigoPorHora = 0;
		this.lenguajeDominante = "";
	}

	public int getLineaDeCodigoPorHora() {
		return lineaDeCodigoPorHora;
	}

	public void setLineaDeCodigoPorHora(int lineaDeCodigoPorHora) {
		this.lineaDeCodigoPorHora = lineaDeCodigoPorHora;
	}

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}
	
	

	@Override
	public String toString() {
		return "Programador [lineaDeCodigoPorHora=" + lineaDeCodigoPorHora + ", lenguajeDominante=" + lenguajeDominante
				+ ", nombreCompleto=" + nombreCompleto + ", cedula=" + cedula + ", edad=" + edad + ", casado=" + casado
				+ ", salario=" + salario + "]";
	}
	
	

}
