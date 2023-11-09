class Canteen
{
	String type;
	String[] utensils;
	
	
	 void showInfo(String type,String[] utensils)
	{
		System.out.println("Starting the restorentTop in the Restorent");
		this.type=type;
		System.out.println("type:"+type);
		this.utensils=utensils;
		System.out.println("type:"+utensils);
		
		
		if(this.utensils!=null)
		{
			for(int seq=0; seq<this.utensils.length; seq++)
				
				{
					String items=utensils[seq];
					System.out.println("items:"+items);
				}
		}
			else
			{
				System.out.println("sequence is not corect");
			}
		System.out.println("Starting the restorentTop in the Restorent");	
	}
}