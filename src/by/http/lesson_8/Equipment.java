package by.http.lesson_8;

public class Equipment {	
	
	private int ID;
	private String name;	
	private  Category category;
	private int price;
	
	
	public Equipment(int ID, String name, Category category, int price, Renstation st) {
		//super();
		this.ID = ID;
		this.name = name;
		this.category = category;
		this.price = price;
		st.addEquipment(this);
		st.addfreeEquipment(this);
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
	
//	private int quantity;
//	
//	public static void outEquipment(){			//Метод который выводит список оборудования
//		
//		Category[] cat = Category.values();
//		for(Category c : cat) {
//		    System.out.println(c+" "+c.getQuantity());
//		    
//		    
//		}
//	}
//	
//	
//	public void addQuantity(int quantity, String cat)
//	{
//		//Category cat;
//		category = Category.valueOf(cat);
//
//		//textViewInfo.setText(cat.toString());
//	}

}
