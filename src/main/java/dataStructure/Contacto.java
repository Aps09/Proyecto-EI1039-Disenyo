package dataStructure;

import java.util.List;

public class Contacto {
	
	//Falta constructor por defecto
	//Falta controlar valores no válidos listas
	
	private String nombre;
	private String apellido;
	private List<Email> emails;
	private List<Telefono> telefonos;
	private List<String> grupos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public List<String> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<String> grupos) {
		this.grupos = grupos;
	}
	
	public void addEmail(Email email) {
		emails.add(email);
	}
	
	public void removeEmail(Email email) {
		emails.remove(email);
	}
	
	public void addTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public void removeTelefono(Telefono telefono) {
		telefonos.remove(telefono);
	}
	
	public void addGrupo(String grupo) {
		grupos.add(grupo);
	}
	
	public void removeGrupo(String grupo) {
		grupos.remove(grupo);
	}

}
