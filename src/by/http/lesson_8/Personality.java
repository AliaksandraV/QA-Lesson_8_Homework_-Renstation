package by.http.lesson_8;

public class Personality extends Client {
	
	private int ID;
	private String name;
	private String surname;
	

	public Personality(int Id, String name, String surname, Client c) {
		super();
		this.ID = Id;
		this.name = name;
		this.surname = surname;
		c.addClient(this);
	}

	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}



	
	
	
	
	

}
