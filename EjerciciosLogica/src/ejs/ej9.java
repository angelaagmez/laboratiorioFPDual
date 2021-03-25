package ejs;

public class ej9 {
	public static void main(String[] args) {
		System.out.println(dormirSemana(true,false));
		System.out.println(dormirSemana(false,true));
		dormirSemana(true,true);
		dormirSemana(false,false);
		
		
	}
	
	public static boolean dormirSemana(boolean diaDeSemana, boolean vacaciones) {
		boolean dormir = false;
		
		if(diaDeSemana==true) {
			dormir = true;
		}else if(diaDeSemana==true && vacaciones==true ||
				diaDeSemana==false && vacaciones==false) {
			System.out.println("No puede ser dia de semana y vacaciones a la vez y viceversa");
		}else {
			dormir = false;
		}
		
		return dormir;
	}

}
