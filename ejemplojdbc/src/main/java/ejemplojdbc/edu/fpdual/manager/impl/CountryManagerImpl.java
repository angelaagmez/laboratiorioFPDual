package ejemplojdbc.edu.fpdual.manager.impl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.mysql.cj.MysqlType;

import ejemplojdbc.edu.fpdual.dao.City;
import ejemplojdbc.edu.fpdual.dao.Country;

/**
 * Country DTO Manager.
 * 
 * Contains all the queries used to consult and manipulate Countries data.
 * 
 * @author jose.m.prieto.villar
 *
 */
public class CountryManagerImpl {

	/**
	 * Finds all the cities in the DB based on a list of ids.
	 * 
	 * @param con DB connection
	 * @param ids Countries id set to search for.
	 * @return a {@link List} of {@link Country}
	 */
	public List<Country> findAllById(Connection con, Set<String> ids) {
		// Creates the SQL command
		String sql = String.format("SELECT * FROM Country WHERE Code IN (%s)",
				ids.stream().map(data -> "\"" + data + "\"").collect(Collectors.joining(", ")));
		// "ESP","FR","DEU","UK","PR"
		// SELECT * FROM Country WHERE Code in ("ESP","FR","DEU","UK","PR"

		// Create a prepared statement
		try (Statement stmt = con.createStatement()) {

			// Executes sql command
			ResultSet result = stmt.executeQuery(sql);
			// Set before first registry before going through it.
			result.beforeFirst();

			// Initializes variables
			List<Country> countries = new ArrayList<>();

			// Run through each result
			while (result.next()) {
				// Initializes a country per result
				countries.add(new Country(result));
			}

			return countries;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Country> findBySurfaceAreaBetween(Connection con, BigDecimal startSurfaceArea,
			BigDecimal endSurfaceArea) throws SQLException {

		try (PreparedStatement prepStmt = con
				.prepareStatement("SELECT * FROM Country where SurfaceArea between ? and ?")) {
			prepStmt.setBigDecimal(1, startSurfaceArea);
			prepStmt.setBigDecimal(2, endSurfaceArea);
			
			return prepareReturn(prepStmt.executeQuery());
		}

	}
	
	private List<Country> prepareReturn(ResultSet result) throws SQLException{

		List<Country> countries = new ArrayList<>();
		
		while(result.next()) {
			countries.add(new Country(result));
		}
		
		return countries;
	}
}