# java-teller

`java-teller` es un utilitario para programadores que están dando sus primeros pasos. Leerá la descripción externa de una clase, para poder comprobar si las interpretaciones son correctas.

[![Historias en Ready](https://badge.waffle.io/delucas/java-teller.png?label=ready)](https://waffle.io/delucas/java-teller)  
[![Build Status](https://travis-ci.org/delucas/java-teller.png?branch=master)](https://travis-ci.org/delucas/java-teller)

## Temática

Alineado con las herramientas que ayudan a los programadores a dar sus primeros pasos, ésta presenta una forma simple de ver la descripción de una clase. Supongamos que tenemos la siguiente clase:

```java
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
```

La descripción obtenida gracias a Teller sería:

> Voy a describirte el aspecto externo que tiene cualquier Perro:
> 
> Todo objeto del tipo Perro es una especialización de Object, por lo que es posibile utilizar un Perro en cualquier sitio donde se requiera un Object.
> 
> Todo objeto del tipo Perro puede crearse proporcionando como información los siguientes tipos de campos:
>  - String
> Todo objeto del tipo Perro puede crearse sin necesidad de proporcionar ninguna información adicional.
> 
> Todo objeto del tipo Perro reacciona al mensaje obtenerRaza, el cual retorna String y no requiere parámetros.
> Todo objeto del tipo Perro reacciona al mensaje establecerRaza, el cual retorna void y requiere como parámetros:
>  - String.

Teniendo de esa manera una idea general de la interpretación de más alto nivel de una la estructura externa de una clase.

## Modo de uso

1. Agregar el .jar de *teller* al proyecto.
2. Crear y ejecutar algún método que tenga el siguiente código:

```java
    System.out.println(new Teller(Perro.class).tell());
```
Así de simple. Por supuesto, reemplazar `Perro` por el nombre de la clase que quieras inspeccionar.

## Contribuciones

1. Hacer un fork
2. Crear un feature-branch (`git checkout -b my-new-feature`)
3. Commitear los cambios (`git commit -am 'Add some feature'`)
4. Hacer push al branch (`git push origin my-new-feature`)
5. Crear un Pull Request
