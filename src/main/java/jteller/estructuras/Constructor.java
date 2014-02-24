package jteller.estructuras;

import java.util.LinkedList;
import java.util.List;

public class Constructor {
	private List<String> argumentos = new LinkedList<String>();

	public Constructor() { }

	public Constructor(String ... argumentos) {
		for (String argumento : argumentos) {
			this.argumentos.add(argumento);
		}
	}
	public List<String> getArgumentos() {
		return this.argumentos;
	}
}
