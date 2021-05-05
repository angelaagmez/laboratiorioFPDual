package ejemplojdbc.edu.fpdual.dao;

import java.math.BigDecimal;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Country {

	String id;
	String code;
	String name;
	String continent;
	String region;
	BigDecimal surfaceArea;
	int independenceYear;
	BigInteger population;
	Double lifeExpectancy;
	Double gnp;
	Double gnpoId;
	String localName;
	String govermentForm;
	String headOfState;
	int capitalCode;

	public Country(ResultSet result) {
		try {
			this.id = result.getString("Code");
			this.code = result.getString("Code2");
			this.name = result.getString("Name");
			this.continent = result.getString("Continent");
			this.region = result.getString("Region");
			this.surfaceArea = result.getBigDecimal("SurfaceArea");
			this.independenceYear = result.getInt("IndepYear");
			this.population = result.getBigDecimal("population").toBigInteger();
			this.lifeExpectancy = result.getDouble("LifeExpectancy");
			this.gnp = result.getDouble("GNP");
			this.gnpoId = result.getDouble("GNPOld");
			this.localName = result.getString("LocalName");
			this.govermentForm = result.getString("GovernmentForm");
			this.headOfState = result.getString("HeadOfState");
			this.capitalCode = result.getInt("Capital");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public BigDecimal getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(BigDecimal surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public int getIndependenceYear() {
		return independenceYear;
	}

	public void setIndependenceYear(int independenceYear) {
		this.independenceYear = independenceYear;
	}

	public BigInteger getPopulation() {
		return population;
	}

	public void setPopulation(BigInteger population) {
		this.population = population;
	}

	public Double getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(Double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public Double getGnp() {
		return gnp;
	}

	public void setGnp(Double gnp) {
		this.gnp = gnp;
	}

	public Double getGnpoId() {
		return gnpoId;
	}

	public void setGnpoId(Double gnpoId) {
		this.gnpoId = gnpoId;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovermentForm() {
		return govermentForm;
	}

	public void setGovermentForm(String govermentForm) {
		this.govermentForm = govermentForm;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public int getCapitalCode() {
		return capitalCode;
	}

	public void setCapitalCode(int capitalCode) {
		this.capitalCode = capitalCode;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", code=" + code + ", name=" + name + ", continent=" + continent + ", region="
				+ region + ", surfaceArea=" + surfaceArea + ", independenceYear=" + independenceYear + ", population="
				+ population + ", lifeExpectancy=" + lifeExpectancy + ", gnp=" + gnp + ", gnpoId=" + gnpoId
				+ ", localName=" + localName + ", govermentForm=" + govermentForm + ", headOfState=" + headOfState
				+ ", capitalCode=" + capitalCode + "]";
	}
	
	
	
	
}