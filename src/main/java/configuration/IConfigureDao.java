package configuration;

import dao.DaoContacto;
import dao.DaoEmail;
import dao.DaoTelefono;

public interface IConfigureDao {
	
	public DaoContacto getDaoContacto();
	public DaoEmail getDaoEmail();
	public DaoTelefono getDaoTelefono();

}
