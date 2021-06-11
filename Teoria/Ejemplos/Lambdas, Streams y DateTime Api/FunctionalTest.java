package prueba;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class FunctionalTest {

	@Test
	public void predicate_test() {
		Predicate<String> stringIsEmpty = string -> string == null || string.trim().isEmpty();
		assertTrue(stringIsEmpty.test(null));
		assertTrue(stringIsEmpty.test(""));
		assertFalse(stringIsEmpty.test("Fp"));
	}

	@Test
	public void supplier_test() {
		Integer factor = 2;
		Supplier<Integer> numero = () -> factor * 2;
		assertEquals(4, numero.get());
	}

	@Test
	public void consumer_test() {
		List<String> deportes = Arrays.asList("Futbol", "Baseball", "Baloncesto", "Volleyball", "Tennis", "Padel");
		Consumer<String> funcion = string -> System.out.println(string);
		deportes.forEach(funcion);
	}

	@Test
	public void ToLongFunction_test() {
		ToLongFunction<Boolean> funcion = string -> string ? ((Double) (Math.random() * 1000)).longValue() : 0;
		System.out.println(funcion.applyAsLong(true));
	}

	@Test
	public void function_test() {
		List<String> deportes = Arrays.asList("Futbol", "Baseball", "Baloncesto", "Volleyball", "Tennis", "Padel");
		Function<String, String> conversionString = string -> toUpperCase(string);
		deportes.forEach(data -> conversionString.apply(data));
	}

	@Test
	public void function_methodReference_test() {
		List<String> deportes = Arrays.asList("Futbol", "Baseball", "Baloncesto", "Volleyball", "Tennis", "Padel");
		Function<String, String> conversionString = string -> toUpperCase(string);
		deportes.forEach(conversionString::apply);
	}

	private String toUpperCase(String s) {
		System.out.println(s.toUpperCase());
		return s.toUpperCase();
	}

}
