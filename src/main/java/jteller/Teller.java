package jteller;

import java.io.IOException;

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

			retorno = template.apply("");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return retorno;
	}

}
