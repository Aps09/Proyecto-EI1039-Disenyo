package fileStorage;

public class ManageFile {
	
	//Constants
	
	private String DEFAULT_PATH = "agenda";
	
	//Static body
	
	private static ManageFile mg;
	
	public static ManageFile getInstance() {
		if (mg == null)
			mg = new ManageFile();
		return mg;
	}
	
	//Instanciate body
	
	public ManageFile() {
		LoadStore.createDirectorySave(DEFAULT_PATH);
	}
	

}
