package jteller.estructuras;

import java.util.LinkedList;
import java.util.List;

public class Clase {
	private String nombre;
	private Clase superclase;
	private List<Constructor> constructores = new LinkedList<Constructor>();

	public Clase(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setSuperclase(Clase clase) {
		this.superclase = clase;
	}

	public Clase getSuperclase() {
		return this.superclase;
	}

	public void addConsturctor(Constructor constructor) {
		this.constructores.add(constructor);
	}

	public List<Constructor> getConstructores() {
		return this.constructores;
	}
}
