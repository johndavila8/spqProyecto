package com.Recuperacion.spqProyecto.Cliente;

import java.util.Scanner;

import com.Recuperacion.spqProyecto.Clases.*;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;




public class Cliente {
	
	static Client client = ClientBuilder.newClient();
	static WebTarget appTarget = client.target("http://localhost:8080/myapp");
	static WebTarget usuarioTarget = appTarget.path("usuarios");
	static  WebTarget registroTarget = usuarioTarget.path("registroUsuario");
	
	public static void main(String[] args) {
		
//		final WebTarget existeUsuarioTarget = usuarioTarget.path("existeUsuario");
		// TODO Auto-generated method stub
		
		registrar();
		
	}
	public static void registrar() {
		
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Introduce tu nombre" );
		String nombre = sc.nextLine();
	
		System.out.println("Introduce una contrasena" );
		String pw = sc.nextLine();
		
		//sc.close();
		
		Usuario u = new Usuario();
		u.setNombre(nombre);
		u.setPw(pw);
		System.out.println(u);
		
		registroTarget.request().post(Entity.entity(u, MediaType.APPLICATION_JSON));
		System.out.println("aupa ahi");
	}
	

}
