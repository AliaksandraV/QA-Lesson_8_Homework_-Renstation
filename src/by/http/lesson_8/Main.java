package by.http.lesson_8;

public class Main {

	public static void main(String[] args) {		
		
		Renstation renstation = new Renstation();		
		
		Equipment bike1 = new Bike(0, "Velpro", Category.CHILD, 10, renstation);
		Equipment bike2 = new Bike(1, "VelTurbo", Category.CHILD, 100, renstation);
		Equipment bike3 = new Bike(2, "SanyVel", Category.CHILD, 15, renstation);	
		Equipment bike4 = new Bike(2, "MaxVel", Category.VZROSLII, 15, renstation);	
		Equipment bike5 = new Bike(2, "SanyVel-9000", Category.VZROSLII, 15, renstation);	
		
		//renstation.eqInfoPrint();	
		
		//renstation.freeEqInfoPrint();
		
		Client client1 = new Client("Vasia", "Pupkin", renstation);
		Client client2 = new Client("Petia", "Bobrov", renstation);
		
		
		//renstation.clientPrint();
		
		RentUnit rentUnit1 = new RentUnit (bike2, client1, renstation);		//Cделать проверку что это оборудование уже сдано в прокат
		RentUnit rentUnit2 = new RentUnit (bike1, client1, renstation);
		RentUnit rentUnit3 = new RentUnit (bike3, client1, renstation);
		RentUnit rentUnit4 = new RentUnit (bike4, client1, renstation);
		RentUnit rentUnit5 = new RentUnit (bike5, client1, renstation);
		//
		//renstation.freeEqInfoPrint();
		
		renstation.rentUnitPrint();
		
		


	}

}
