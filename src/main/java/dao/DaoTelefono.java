package dao;

import java.util.List;

import dataStructure.Contacto;
import dataStructure.Telefono;

public interface DaoTelefono {
	
	public List<Telefono> getTelefonos(Contacto contacto);
	public List<Telefono> getTelefonos(int id);

}
