package DAOlocal;

import model.Usuario;

public interface UsuarioDAOLocal {

	public Boolean Registrar(Usuario x) throws Exception;
	public Boolean Actualizar(Usuario x) throws Exception;
	public Boolean Eliminar(Usuario x) throws Exception;
	public Boolean IniciarSesion(Usuario x) throws Exception;
	public Boolean CerrarSesion(Usuario x) throws Exception;
	
	
}
