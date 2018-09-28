package DAOImp;



import javax.persistence.Query;

import DAOlocal.UsuarioDAOLocal;
import model.Usuario;
import util.conexion;

public class UsuarioDAOImp implements UsuarioDAOLocal {
	conexion cn = new conexion();
	@Override
	public Boolean Registrar(Usuario x) throws Exception {
		cn.Abrir_Conexion();
		try {
			
			cn.em.getTransaction().begin();
			cn.em.persist(x);
			cn.em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			cn.Cerrar_Conexion();
		}
		
		return null;
	}

	@Override
	public Boolean Actualizar(Usuario x) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean Eliminar(Usuario x) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean IniciarSesion(Usuario x) throws Exception {
			Usuario usuario = null;
		try {
			cn.Abrir_Conexion();
			
			cn.em.getTransaction().begin();
			Usuario us = cn.em.find(Usuario.class, x.getIdusuario());
			Query qr = cn.em.createQuery("select u from Usuario u where u.usuario=:p1 and u.clave=:p2");
			qr.setParameter("p1", x.getUsuario());
			qr.setParameter("p2", x.getClave());
			usuario = (Usuario) qr.getSingleResult();
			
			cn.em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			cn.Cerrar_Conexion();
		}
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean CerrarSesion(Usuario x) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
