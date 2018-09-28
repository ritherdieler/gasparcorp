package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class conexion {

		public EntityManager em;
		public EntityManagerFactory emf;
	public void Abrir_Conexion() throws Exception
	{
		emf=Persistence.createEntityManagerFactory("ISP");
		em=emf.createEntityManager();
	}
	
	public void Cerrar_Conexion() throws Exception
	{
		em.close();
		emf.close();
	}
	
	
}
