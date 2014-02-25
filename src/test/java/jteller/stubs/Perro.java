package jteller.stubs;

public class Perro {

	private String raza;

	public Perro() { }

	public Perro(String raza) {
		this.raza = raza;
	}

	public String obtenerRaza() {
		return this.raza;
	}

	public void establecerRaza(String raza) {
		this.raza = raza;
	}

}
