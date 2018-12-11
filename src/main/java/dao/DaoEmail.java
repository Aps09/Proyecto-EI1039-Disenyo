package dao;

import java.util.List;

import dataStructure.Contacto;
import dataStructure.Email;

public interface DaoEmail {
	
	public List<Email> getEmails(Contacto contacto);
	public List<Email> getEmails(int id);

}
