package jteller;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import jteller.estructuras.Clase;
import jteller.estructuras.Constructor;
import jteller.estructuras.Metodo;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;

public class Teller {

	private Class<? extends Object> clase;

	public Teller(final Class<? extends Object> clase) {
		this.clase = clase;
	}

	private String obtenerNombre() {
		return this.clase.getSimpleName();
	}

	private String obtenerSuperclase() {
		return this.clase.getSuperclass().getSimpleName();
	}

	// TODO: please, refactor
	public String tell() {
		String retorno = "";
		try {
			Handlebars handlebars = new Handlebars();

			Template template;
			template = handlebars.compile("clase");

			Clase clase = new Clase(obtenerNombre());
			clase.setSuperclase(new Clase(obtenerSuperclase()));

			for (java.lang.reflect.Constructor it : this.clase.getConstructors()) {
				clase.addConsturctor(convertirConstructor(it));
			}

			for (Method it : this.clase.getDeclaredMethods()) {
				clase.addMetodo(convertirMetodo(it));
			}

			Map<String, Clase> mapa = new HashMap<String, Clase>();
			mapa.put("clase", clase);
			retorno = template.apply(mapa);

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return retorno;
	}

	private Metodo convertirMetodo(final Method it) {
		Metodo resultado = new Metodo(it.getName());
		resultado.setTipoRetorno(it.getReturnType().getSimpleName());
		for (Class clase : it.getParameterTypes()) {
			resultado.addParametro(clase.getSimpleName());
		}
		return resultado;
	}

	private Constructor convertirConstructor(final java.lang.reflect.Constructor it) {
		List<String> tiposConstructor = new LinkedList<String>();
		for (Class tipos : it.getParameterTypes()) {
			tiposConstructor.add(tipos.getSimpleName());
		}
		return new Constructor(tiposConstructor.toArray(new String[tiposConstructor.size()]));
	}
}
