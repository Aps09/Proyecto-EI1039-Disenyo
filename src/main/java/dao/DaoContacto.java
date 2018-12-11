package dao;
import java.util.List;

import dataStructure.Contacto;

public interface DaoContacto {
	
	public List<Contacto> getAllContactos();
	public Contacto getContacto(int id);

}
