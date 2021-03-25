package ej2;

public class Main {
	public static void main(String[] args) {
		Empleado e1 = new Programador("Angela Bonilla","1234567U",24,true,2300.1,400,"Java");
		
		System.out.println(e1.aumentarSalario(0.6));
		
		e1.mostrarClasificacion();
		
		Empleado e2 = new Programador("Gonzalo Waack","28734736Y",37,true,3400.5,700,"Java");
		Empleado e3 = new Programador("Guillermo Martinez","923748378M",19,false,1200.2,200,"Java");
		
		e2.mostrarClasificacion();
		e3.mostrarClasificacion();
		
		e2.setEdad(60);
		e2.mostrarClasificacion();
		
		e2.setEdad(37);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
