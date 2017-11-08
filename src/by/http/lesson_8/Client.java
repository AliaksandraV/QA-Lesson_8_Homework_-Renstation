package by.http.lesson_8;

public class Client {

	private String name;
	private String surname;
	private int numberOfEq;
	
//	private Personality[] pers = new Personality[100];
//	 private int perscount = 0;
	 
//	 public void addClient(Personality per)
//	 {
//		 pers[perscount] = per;
//		 perscount++;		 
//		 
//	 }
//	 
//	 public void clientPrint()
//	 {
//		 for (int i=0; i<perscount; i++)
//			{
//				System.out.println("Name " +pers[i].getName()+ " Surname "+ pers[i].getSurname());
//			}
//	 }

	 
	public Client(String name, String surname,  Renstation st) {
		super();
		this.name = name;
		this.surname = surname;
		st.addClient(this);
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


	public int getNumberOfEq() {
		return numberOfEq;
	}
	public void setNumberOfEq(int numberOfEq) {
		this.numberOfEq = this.numberOfEq+numberOfEq;
	}

	
	 
	 
	 	
	
	
	
	
	
	
	
	

}
