package com.Recuperacion.spqProyecto.Clases;
import java.util.Date;

import javax.jdo.annotations.*;
//import javax.jdo.annotations.PersistenceCapable;
//import javax.jdo.annotations.Persistent;
//import javax.jdo.annotations.PrimaryKey;

/**
 * Clase Tarea clase objeto para las diferentes tareas 
 * @author En documentacion :John
 *
 */


@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)

public class Tarea {


	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.INCREMENT)
	
	private int idTarea;
	private String nombre;
	private Date fecha;
	private String descripcion;

	/**
     * Constructor de Tareas
     * @param String nombre para saber el nombre de la clase Tarea
     * @param Date fecha para saber la fecha para la que esta asignada la tarea de la clase Tarea
     * @param String descripcion para saber la descripcion de la clase Tarea
     */
	
	public Tarea(String nombre, Date fecha, String descripcion) {
		super();
		
		this.nombre = nombre;
		this.fecha = fecha;
		this.descripcion = descripcion;
		
	}

	/**
     * Devuelve el id de la Tarea
     * @return Int con el id de la Tarea
     */
	
	public int getIdTarea() {
		return idTarea;
	}

	/**
     * Para cambiar el id de la Tarea
     * @param  Int con el nuevo id de la Tarea
     */
	
	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}
	
	/**
     * Devuelve el nombre de la clase Tarea
     * @return String con el nombre de la Tarea
     */
	
	public String getNombre() {
		return nombre;
	}

	 /**
     * Para cambiar el nombre de la Tarea
     * @param nombre String con el nombre de la Tarea
     */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
     * Devuelve la fecha de la clase Tarea
     * @return Date con la fecha de la Tarea
     */

	public Date getFecha() {
		return fecha;
	}

	 /**
     * Para cambiar la fecha de la Tarea
     * @param fecha Date con la fecha de la Tarea
     */
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
     * Devuelve la descripcion de la clase Tarea
     * @return String con la descripcion de la Tarea
     */
	
	public String getDescripcion() {
		return descripcion;
	}

	/**
     * Para cambiar la descripcion de la Tarea
     * @param descripcion String con la descripcion de la Tarea
     */
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
     * toString de la clase Tarea
     */
	
	@Override
	public String toString() {
		return "Tarea [idTarea=" + idTarea + ", nombre=" + nombre + ", fecha=" + fecha + ", descripcion=" + descripcion
				+"]";
	}	
	
	
	
	
}
