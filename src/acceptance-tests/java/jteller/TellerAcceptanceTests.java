package jteller;

import jteller.stubs.Perro;

import org.junit.Test;

public class TellerAcceptanceTests {

	@Test
	public void queEmiteInforme() {
		System.out.println(new Teller(Perro.class).tell());
	}
}
