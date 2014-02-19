package jteller;

public class Teller {

	private Class<? extends Object> clase;

	public Teller(final Class<? extends Object> clase) {
		this.clase = clase;
	}

	public String obtenerNombre() {
		return this.clase.getSimpleName();
	}

	public String obtenerPaquete() {
		return this.clase.getPackage().getName();
	}

}
