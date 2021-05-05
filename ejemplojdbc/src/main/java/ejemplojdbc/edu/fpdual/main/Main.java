package ejemplojdbc.edu.fpdual.main;

import java.sql.Connection;
import java.sql.SQLException;

import ejemplojdbc.edu.fpdual.conector.Conector;

public class Main {
	public static void main(String[] args) {
		//Connects to the DB
		try(Connection con = new Conector().getMySQLConnection()) {
			//Looks for all the cities in the DB and prints them.
			// new CityManager().findAll(con).forEach(city ->System.out.println(city));
			System.out.println(con.getCatalog());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

