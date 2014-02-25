package jteller;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import jteller.stubs.Perro;

import org.junit.Test;

public class TellerTests {

	@Test
	public void quePuedeInstanciarse() {
		assertThat(new Teller(Perro.class), notNullValue());
	}
}
