package com.Recuperacion.spqProyecto.Clases;

import java.util.Iterator;
import java.util.List;

import javax.jdo.*;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

@Path("tareas")

public class TareasResource {
	
	@POST  
	@Path("daralta")
	@Consumes(MediaType.APPLICATION_JSON)
	public void darDeAltaNuevaTarea(Tarea tarea) {

		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();

		try {
			tx.begin();

			pm.makePersistent(tarea);

			tx.commit();

		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}
	
	@GET
	@Path("fechaorden")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tarea> ordenPorFecha() {
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();

		tx.begin();

		Query<Tarea> query = pm.newQuery("javax.jdo.query.SQL", "select * from tarea order by fecha desc");
		query.setClass(Tarea.class);
		List<Tarea> results = query.executeList();

		tx.commit();
		pm.close();
		return results;

	}
	
	@PUT
	@Path("modificar")
	@Produces(MediaType.APPLICATION_JSON)
	public void modificarTarea(Tarea tarea) {

		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();

		tx.begin();

		Query query = pm.newQuery("javax.jdo.query.SQL", "UPDATE tarea SET nombre='" + tarea.getNombre() + "', fecha='" + tarea.getFecha()
		+ "', descripcion='" + tarea.getDescripcion() + "'");
		query.setClass(Tarea.class);
		Long update = (Long) query.execute();

		tx.commit();
		pm.close();

	}
	
	@DELETE
	@Path("eliminarT")
	@Produces(MediaType.APPLICATION_JSON)
	 public void eliminarTarea() {
		 PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
	  		PersistenceManager pm = pmf.getPersistenceManager();
	  		Transaction tx = pm.currentTransaction();
	        try {
	     
	            tx.begin();

	            Extent<Tarea> e = pm.getExtent(Tarea.class, true);
	            Iterator<Tarea> iter = e.iterator();
	            while (iter.hasNext()) {
	            	Tarea tarea = (Tarea) iter.next();
	                 pm.deletePersistent(tarea);
	                
	            }

	            tx.commit();
	        } catch (Exception ex) {
	            
	        } finally {
	            if (tx != null && tx.isActive()) {
	                tx.rollback();
	            }
	            pm.close();
	        }
	    }

	

	
}
