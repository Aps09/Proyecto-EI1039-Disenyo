package messages;

public enum Message {
	CHANGED_CONTACTOS(1);
		
	private int id;
	
	Message(int id){
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

}
