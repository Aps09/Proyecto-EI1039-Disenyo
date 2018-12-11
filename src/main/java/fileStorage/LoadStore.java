package fileStorage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LoadStore {

	public static <T> void guardar(T objeto, String fichero) throws IOException {
		File f = new File(fichero);
	    f.delete();
	    f.createNewFile();
		FileOutputStream fos = new FileOutputStream(fichero);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(objeto);
		oos.close();
	}

	public static <T> T cargar(String fichero) throws ClassNotFoundException, IOException {
	   
		FileInputStream fis = new FileInputStream(fichero);
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		T aplicacion = (T) ois.readObject();
		ois.close();
		return aplicacion;
	}
	
	private static void initFirstDirectory(String filePath){
		File fichero = new File(filePath);
		try {
			fichero.mkdirs();
			fichero.createNewFile();
		} catch (IOException e1) {
			System.out.println("Error al crear el fichero");
			e1.printStackTrace();
		}
	}
	
	public static void createDirectorySave(String filePath) {
		File fichero = new File(filePath);
		if(!fichero.exists()){
			initFirstDirectory(filePath);
		}
	}
	
	private static void initFirstFile(String filePath){
		File fichero = new File(filePath);
		try {
			fichero.createNewFile();
		} catch (IOException e1) {
			System.out.println("Error al crear el fichero");
			e1.printStackTrace();
		}
	}
	
	private static void checkFile(String filePath) {
		File fichero = new File(filePath);
		if(!fichero.exists()){
			initFirstFile(filePath);
		}
	}
	
	public static <T> void guardarSave(T objeto, String filePath) throws IOException {
		checkFile(filePath);
		guardar(objeto, filePath);
	}
	
	public static <T> T cargarSave(String filePath) throws ClassNotFoundException, IOException {
		checkFile(filePath);
		return cargar(filePath);
	}
}
