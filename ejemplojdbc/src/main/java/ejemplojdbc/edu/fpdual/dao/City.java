package ejemplojdbc.edu.fpdual.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class City {

	int id;
	String name;
	Country country;
	String district;
	BigDecimal population;
	
	



	public City(ResultSet result) {
		try {
			this.id = result.getInt("ID");
			this.name = result.getString("name");
			this.district = result.getString("District");
			this.population = result.getBigDecimal("Population");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Country getCountry() {
		return country;
	}



	public void setCountry(Country country) {
		this.country = country;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public BigDecimal getPopulation() {
		return population;
	}



	public void setPopulation(BigDecimal population) {
		this.population = population;
	}


	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", country=" + country + ", district=" + district + ", population="
				+ population + "]";
	}
	
	
	
	
}
