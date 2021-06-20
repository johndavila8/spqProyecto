package com.Recuperacion.spqProyecto.Clases;

import java.util.List;



import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * Clase Usuario  clase objeto para las diferentes localidades
 * @author En documentacion :John
 *
 */

@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)

public class Usuario {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.INCREMENT)
	private int idUsuario;
	private String nombre;
	private String pw;
	private List<Tarea> tareasPendientes;
	
	 /**
     * Constructor 
     * @param String nombre para saber el nombre de la clase Usuario
     * @param String pw para saber la contrasena de la clase Usuario
     */
	
	
	public Usuario(String nombre, String pw) {
		super();
		
		this.nombre = nombre;
		this.pw = pw;
		
	}
	  /**
     *Constructor vacio de Usuario
     */
	
	public Usuario() {
		super();
		
		this.nombre = "";
		this.pw = "";
		
	}
	
	/**
     * Devuelve el id del Usuario
     * @return Int con el id del Usuario
     */
	

	public int getId() {
		return idUsuario;
	}
	
	/**
     * Para cambiar el id del  Usuario
     * @param  Int con el nuevo id del Usuario
     */

	public void setId(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	 /**
     * Devuelve el nombre de la clase Usuario
     * @return String con el nombre del Usuario
     */
	
	public String getNombre() {
		return nombre;
	}

	/**
     * Para cambiar el nombre del Usuario
     * @param nombre String con el nombre del Usuario
     */
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	 /**
     * Devuelve la contrasena de la clase Usuario
     * @return String con la contrasena del Usuario
     */
	
	public String getPw() {
		return pw;
	}

	/**
     * Para cambiar la contrasena de un Usuario
     * @param pw String con la contrasena del Usuario
     */
	
	public void setPw(String pw) {
		this.pw = pw;
	}

	public List<Tarea> getTareasPendientes() {
		return tareasPendientes;
	}

	public void setTareasPendientes(List<Tarea> tareasPendientes) {
		this.tareasPendientes = tareasPendientes;
	}

	 /**
     * toString de la clase Usuario
     */
	
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", pw=" + pw + ", tareasPendientes="
				+ tareasPendientes + "]";
	}
	
	
	
}
