package configuration;

import dao.DaoContacto;
import dao.DaoEmail;
import dao.DaoTelefono;
import fileStorage.ManageFileContacto;
import fileStorage.ManageFileEmail;
import fileStorage.ManageFileTelefono;

public class ConfigureDaoFile implements IConfigureDao{
	
	private DaoContacto daoContacto;
	private DaoEmail daoEmail;
	private DaoTelefono daoTelefono;
	
	public ConfigureDaoFile() {
		daoContacto = new ManageFileContacto();
		daoEmail = new ManageFileEmail();
		daoTelefono = new ManageFileTelefono();
	}

	@Override
	public DaoContacto getDaoContacto() {
		return daoContacto;
	}

	@Override
	public DaoEmail getDaoEmail() {
		return daoEmail;
	}

	@Override
	public DaoTelefono getDaoTelefono() {
		return daoTelefono;
	}

}
