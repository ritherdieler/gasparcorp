package services;

import DAOImp.UsuarioDAOImp;
import model.Usuario;

public class UsuarioService  extends UsuarioDAOImp{

	@Override
	public Boolean Registrar(Usuario x) throws Exception {
		// TODO Auto-generated method stub
		return super.Registrar(x);
	}

	@Override
	public Boolean Actualizar(Usuario x) throws Exception {
		// TODO Auto-generated method stub
		return super.Actualizar(x);
	}

	@Override
	public Boolean Eliminar(Usuario x) throws Exception {
		// TODO Auto-generated method stub
		return super.Eliminar(x);
	}

	@Override
	public Boolean IniciarSesion(Usuario x) throws Exception {
		// TODO Auto-generated method stub
		return super.IniciarSesion(x);
	}

	@Override
	public Boolean CerrarSesion(Usuario x) throws Exception {
		// TODO Auto-generated method stub
		return super.CerrarSesion(x);
	}

}
