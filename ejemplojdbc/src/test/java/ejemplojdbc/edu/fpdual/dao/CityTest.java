package ejemplojdbc.edu.fpdual.dao;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejemplojdbc.edu.fpdual.conector.Conector;

class CityTest {
	Conector c = new Conector();
	LinkedList<City> cities; 
	
	@BeforeAll
	static void before() {
		System.out.println("Empezando las pruebas");
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("Antes de cada test");
		Connection con = c.getMySQLConnection();
		try(Statement stmt = con.createStatement()) {
			cities = new LinkedList<>();
			
			ResultSet result = stmt.executeQuery("SELECT * FROM city JOIN country ON city.CountryCode=country.Code ");
			result.beforeFirst();
			
			while(result.next()) {
				City cit = new City(result);
				cit.setCountry(new Country(result));
				cities.add(cit);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@AfterEach
	void countDown() {
		cities.clear();
	}
	

	@Test
	void testCity() {
		assertNotNull(cities.get(0).getId());
		assertNotNull(cities.get(0).getName());
		assertNotNull(cities.get(0).getCountry());
		assertNotNull(cities.get(0).getDistrict());
		assertNotNull(cities.get(0).getPopulation());
	}


}
