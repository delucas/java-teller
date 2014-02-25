package jteller.estructuras;

import java.util.LinkedList;
import java.util.List;

public class Metodo {

	private String nombre;
	private List<String> parametros = new LinkedList<String>();
	private String tipoRetorno;

	public Metodo(final String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipoRetorno() {
		return tipoRetorno;
	}

	public List<String> getParametros() {
		return parametros;
	}

	public void addParametro(final String parametro) {
		this.parametros.add(parametro);
	}

	public void setTipoRetorno(final String tipoRetorno) {
		this.tipoRetorno = tipoRetorno;
	}

}
