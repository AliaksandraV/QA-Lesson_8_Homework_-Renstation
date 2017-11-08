package by.http.lesson_8;

public class RentUnit {		//количество выданного в прокат снаряжения.
	
	private Equipment unit;
	private Client client;
	
	
	
	public RentUnit(Equipment eq, Client cl, Renstation r)
	{
		if(cl.getNumberOfEq()!=3)
		{
			unit = eq;
			client = cl;
			cl.setNumberOfEq(1);
			r.addRentUnit(this);
			r.delfreeEquipment(eq.getID());
		}
		else{
			System.out.println("U etogo clienta maksimalno dostupnoe kolichestvo oborudovania");
		}
	}



	public Equipment getUnit() {
		return unit;
	}
	public void setUnit(Equipment unit) {
		this.unit = unit;
	}


	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}




	
	
	
}
