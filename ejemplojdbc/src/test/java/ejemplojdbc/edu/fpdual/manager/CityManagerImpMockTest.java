package ejemplojdbc.edu.fpdual.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import ejemplojdbc.edu.fpdual.dao.City;
import ejemplojdbc.edu.fpdual.manager.impl.CityManagerImpl;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class CityManagerImpMockTest {

	@InjectMocks
	CityManagerImpl cityManager;

	@Mock
	private Connection con;

	@Mock
	Statement statement;

	@Mock
	ResultSet resultSet;

	@Spy
	List<String> spiedList;
	
	private int idMasAlto;
	private String name = "Prueba";

	@BeforeEach
	public void setUp() throws SQLException, ClassNotFoundException {
		MockitoAnnotations.initMocks(this);
		Mockito.when(con.createStatement()).thenReturn(statement);
		Mockito.when(statement.executeQuery(Mockito.anyString())).thenReturn(resultSet);
		Mockito.when(resultSet.getInt("ID")).thenReturn(1);
		Mockito.when(resultSet.getString(Mockito.anyString())).thenReturn("String Prueba");
		Mockito.when(resultSet.getBigDecimal("Population")).thenReturn(BigDecimal.TEN);
		Mockito.when(resultSet.next()).thenAnswer(new Answer<Boolean>() {

			private int count = 0;

			@Override
			public Boolean answer(InvocationOnMock invocation) throws Throwable {
				if (count == 0) {
					count++;
					return true;
				} else {
					return false;
				}
			}
		});
	}

	@Test
	public void findAll_ok() {
		List<City> cities = cityManager.findAll(con);
		assertNotNull(cities);
		System.out.println(cities.get(0));
	}

	@Test
	public void createCityList() {

		spiedList.add("one");
		spiedList.add("two");

		Mockito.verify(spiedList).add("one");
		Mockito.verify(spiedList).add("two");

		assertEquals(2, spiedList.size());

		Mockito.when(spiedList.size()).thenReturn(100);
		
		assertEquals(100, spiedList.size());

	}

}

