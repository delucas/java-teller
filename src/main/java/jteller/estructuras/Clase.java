package jteller.estructuras;

import java.util.LinkedList;
import java.util.List;


public class Clase {
	private final String nombre;
	private Clase superclase;
	private List<Constructor> constructores = new LinkedList<Constructor>();
	private List<Metodo> metodos = new LinkedList<Metodo>();

	public Clase(final String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setSuperclase(final Clase clase) {
		this.superclase = clase;
	}

	public Clase getSuperclase() {
		return this.superclase;
	}

	public void addConsturctor(final Constructor constructor) {
		this.constructores.add(constructor);
	}

	public List<Constructor> getConstructores() {
		return this.constructores;
	}

	public List<Metodo> getMetodos() {
		return this.metodos;
	}

	public void addMetodo(final Metodo metodo) {
		this.metodos.add(metodo);

	}
}
