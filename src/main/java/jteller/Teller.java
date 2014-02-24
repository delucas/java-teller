package jteller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jteller.estructuras.Clase;
import jteller.estructuras.Constructor;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;

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

	//TODO: implementar
	public String tell() {
		String retorno = "";
		try {
			Handlebars handlebars = new Handlebars();

			Template template;
			template = handlebars.compile("clase");

			// TODO: refactor, creando entidades simples

			Clase clase = new Clase("Perro");
			clase.setSuperclase(new Clase("Mamifero"));
			clase.addConsturctor(new Constructor());
			clase.addConsturctor(new Constructor("String"));

			Map<String, Clase> mapa = new HashMap<String, Clase>();
			mapa.put("clase", clase);



			retorno = template.apply(mapa);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return retorno;
	}

}
