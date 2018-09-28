import model.Usuario;
import services.UsuarioService;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		UsuarioService us = new UsuarioService();
//		Usuario x = new Usuario();
//	
//		x.setUsuario("pip2o");
//		x.setClave("nos2e");
//		us.Registrar(x);
		
		Usuario x = new Usuario();
		x.setUsuario("pipo");
		x.setClave("nosse");
		if(us.IniciarSesion(x))
		{
			System.out.println("se encontro");
		}
		
		else 
		{
			System.out.println("No se encontro");
		}
	}

}
