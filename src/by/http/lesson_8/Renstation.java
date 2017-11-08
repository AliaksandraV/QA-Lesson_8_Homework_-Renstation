package by.http.lesson_8;

public class Renstation {
	private Equipment[] equipment = new Equipment[100];
	private int equipmentCount = 0;
	
	private Client[] client = new Client[100];
	private int clientcount = 0;
	
	private RentUnit [] rentUnit = new RentUnit[100];
	private int rentUnitCount = 0;
	
	private Equipment[] freeEquipment =new Equipment[100];
	private int freeEquipmentCount = 0;
	
	
	public void addEquipment(Equipment eq) 	{		//Добавление объектов в массив
			equipment[equipmentCount] = eq;
			equipmentCount++;		
	}	
	public void addClient(Client cl)	{
		client[clientcount] = cl;
		clientcount++;		 
		 
	}	
	public void addRentUnit(RentUnit ru)	{		
		rentUnit[rentUnitCount] = ru;
		rentUnitCount++;		
	}
	public void addfreeEquipment(Equipment eq) {
		freeEquipment[freeEquipmentCount] = eq;
		freeEquipmentCount++;		
	}
	public void delfreeEquipment(int id) {		
		Equipment[] cash = new Equipment[100];
		int cashCount = 0;		
		for (int i=0; i<freeEquipmentCount; i++)
		{			
			if(freeEquipment[i].getID()!=id)
			{
				cash[cashCount] = freeEquipment[i];
				cashCount++;
			}
		}	
		
		for (int i=0; i<cashCount; i++)
		{
			freeEquipment[i]=cash[i];
		}
		freeEquipmentCount = cashCount;		
	}
	
	
	
	public void eqInfoPrint()		{// Вывод спика всех объектов
		for (int i=0; i<equipmentCount; i++)
		{
			System.out.println("Name " +equipment[i].getName()+ " price "+ equipment[i].getPrice());
		}	
	}	
	 public void clientPrint()	 {
		 for (int i=0; i<clientcount; i++)
			{
				System.out.println("Name " +client[i].getName()+ " Surname "+ client[i].getSurname());
			}
	 }	
	public void rentUnitPrint()	{
		for (int i=0; i<rentUnitCount; i++)
		{
			System.out.println("Name " +rentUnit[i].getClient().getName() + " "+ rentUnit[i].getClient().getSurname()+ " Vsial v prokat "+
					rentUnit[i].getUnit().getName()+" po cene "+rentUnit[i].getUnit().getPrice()+ " u nego uge "+ rentUnit[i].getClient().getNumberOfEq());
			
		}	
	}
	public void freeEqInfoPrint()		{		//Добавить проверку на отсутствие свободного оборудования
		System.out.println("Доступное для проката оборудование:");
		for (int i=0; i<freeEquipmentCount; i++)
		{
			System.out.println("Name " +freeEquipment[i].getName()+ " price "+ freeEquipment[i].getPrice());
		}	
	}
	

}
