package ejercicios;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Cliente c1 = new Cliente("Angela","1234567U",1200.5,22, "Femenino");
	
	c1.saludar();
	c1.despedirse();
	c1.comprar(550.3);
	c1.presentarse();
	System.out.println(c1.comprobarSexo("Masculino"));
	System.out.println(c1.comprobarSexo("Femenino"));
	
	
	Empleado e1 = new Empleado("Gonzalo","12345678U",1250.5);
	e1.saludar();
	System.out.println(e1.ganarDinero(800));
	e1.despedida();
	
	
	Orden o1 = new Orden("PC",1008.5,4638,1.5,c1,e1,false);
	Orden o2 = new Orden("PS4",299.9,8658,1.0,c1,e1,true);
	Orden o3 = new Orden("Altavoz",80.7,2783,0.4,c1,e1,false);
	
	o1.estaComprado();
	o2.infoProducto();
	o3.aumentarPesoPaquete(4.6);
	o1.vender();
	o1.estaComprado();
	
	System.out.println("---------------------------------------");
	System.out.println("");
	
	Saludo saludo = new Saludo("gente");
	Saludo saludo2 = new Saludo("que pasa");
	Saludo saludo3 = new Saludo("amigos");
	
	saludo.imprimir();
	saludo2.imprimir();
	saludo3.imprimir();
	
	System.out.println("---------------------------------------");
	System.out.println("");
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce la palabra");
	String pal = sc.nextLine();
	System.out.println("Introduce el numero de veces que quieres que se repita");
	int num = sc.nextInt();
	
	PalabrasRepetidas p1 = new PalabrasRepetidas(pal,num);
	
	p1.repeticiones();
	
	
	
}
}
