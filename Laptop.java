class Laptop
{
	Hardware[] hardware;
	Owner owner;
	Brand brand;
	
	void setInfo(Hardware[] hardware, Owner owner, Brand brand)
	{
		this.owner=owner;
		this.brand=brand;
		this.hardware=hardware;
	}
	void showInfo()
	{
		System.out.println("Starting the class of Laptop");
		
		owner.showInfo();
		brand.showInfo();
		
		if(this.hardware!=null)
		{
			for(int seq=0; seq<this.hardware.length; seq++)
			{
				Hardware items=hardware[seq];
				items.showInfo();
			}
		}
		
		else
			{
				System.out.println("the statement is wrong");
			}
		
			System.out.println("ending the class of Laptop");
	}
}