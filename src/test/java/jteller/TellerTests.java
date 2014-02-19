package jteller;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import jteller.stubs.Perro;

import org.junit.Test;

public class TellerTests {

	@Test
	public void quePuedeInstanciarse() {
		assertThat(new Teller(Perro.class), notNullValue());
	}

	@Test
	public void quesabeInformarElNombreDeLaClase() {
		Teller teller = new Teller(Perro.class);
		assertThat(teller.obtenerNombre(), is("Perro"));
	}

	@Test
	public void quesabeInformarElPaqueteDeLaClase() {
		Teller teller = new Teller(Perro.class);
		assertThat(teller.obtenerPaquete(), is("jteller.stubs"));
	}

}
