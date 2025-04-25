//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.04.25 a las 09:06:21 PM CEST 
//


package org.example;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Citas }
     * 
     */
    public Citas createCitas() {
        return new Citas();
    }

    /**
     * Create an instance of {@link CitaType }
     * 
     */
    public CitaType createCitaType() {
        return new CitaType();
    }

    /**
     * Create an instance of {@link CargoType }
     * 
     */
    public CargoType createCargoType() {
        return new CargoType();
    }

    /**
     * Create an instance of {@link DetallesType }
     * 
     */
    public DetallesType createDetallesType() {
        return new DetallesType();
    }

    /**
     * Create an instance of {@link PacienteType }
     * 
     */
    public PacienteType createPacienteType() {
        return new PacienteType();
    }

}
