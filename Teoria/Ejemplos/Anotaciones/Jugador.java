package prueba;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Creacion(version = "1.0", creationDate = "21/01/2021")
@AllArgsConstructor
@NoArgsConstructor
public class Jugador {

	String nombre;
	int puntuacion;
	Date ultimaFechaJugado;
	
}
