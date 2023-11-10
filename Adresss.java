class Adresss
{
	String street;
	double pinCode;
	Cities cities;
	
	
	void setInfo(String street, double pinCode, Cities cities)
	{
		this.street=street;
		this.pinCode=pinCode;
		this.cities=cities;
	}
	void showInfo()
	{
		System.out.println("Starting the method in the Adress");
		
		System.out.println("street:"+street);
		
		System.out.println("pinCode:"+pinCode);
		
		cities.showInfo();
		System.out.println("ending the method in the Adress");
	}
	
}