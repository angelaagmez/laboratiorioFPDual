package anotaciones;

public class Main {
	public static void main(String[] args) {
		Zoo zoo = new Zoo(10);
		
		Lion leon1 = new Lion("Mufasa",40,"M",4,20,true);
		Lion leon2 = new Lion("Simba",20,"H",1,5,false);
		
		Monkey mono1 = new Monkey("Mono",30,"H",10,true,115);
		Monkey mono2 = new Monkey("Rafiki",35,"M",12,false,135);
		
		Parrot loro1 = new Parrot("Picu",15,"H",2,"Azul",false);
		Parrot loro2 = new Parrot("Mani",20,"H",3,"Verde",true);
		Parrot loro3 = new Parrot("Coco",24,"M",4,"Amarillo",true);
		
		Penguin pinguino1 = new Penguin("Sasha",25,"H",5,false,4);
		Penguin pinguino2 = new Penguin("Filo",28,"M",7,false,2);
		Penguin pinguino3 = new Penguin("Bimbo",32,"H",9,true,7);
		
		zoo.addAnimales(pinguino3);
		zoo.addAnimales(pinguino2);
		zoo.addAnimales(loro2);
		zoo.addAnimales(mono1);
		zoo.addAnimales(leon2);
		zoo.addAnimales(loro1);
		zoo.addAnimales(pinguino1);
		zoo.addAnimales(leon1);
		zoo.addAnimales(mono2);
		zoo.addAnimales(loro3);
		
		zoo.mostrarAnimales();
		
		System.out.println("");
		
		AnimalMetadata datosLeon = leon1.getClass().getAnnotation(AnimalMetadata.class);
		System.out.println("Leones:");
		System.out.println("Fecha: "+datosLeon.fecha()+" Pais: "+datosLeon.pais());
		
		AnimalMetadata datosMono = mono1.getClass().getAnnotation(AnimalMetadata.class);
		System.out.println("Monos:");
		System.out.println("Fecha: "+datosMono.fecha()+" Pais: "+datosMono.pais());
		
		AnimalMetadata datosLoro = loro1.getClass().getAnnotation(AnimalMetadata.class);
		System.out.println("Loros:");
		System.out.println("Fecha: "+datosLoro.fecha()+" Pais: "+datosLoro.pais());
		
		AnimalMetadata datosPinguino = pinguino1.getClass().getAnnotation(AnimalMetadata.class);
		System.out.println("Pinguinos:");
		System.out.println("Fecha: "+datosPinguino.fecha()+" Pais: "+datosPinguino.pais());
		
	}

}
