class Hardware
{
	String name;
	String type;
	Brand brand;
	
	void setInfo(String name, String type, Brand brand)
	{
		this.name=name;
		this.type=type;
		this.brand=brand;
		
	}
	void showInfo()
	{
		System.out.println("Starting the class of Hardware");
		System.out.println("name:"+name);
		System.out.println("type:"+type);
		if(this.brand!=null)
		{
			brand.showInfo();
			
		}
		System.out.println("ending the class of Hardware");
	}	
}