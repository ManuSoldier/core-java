class Restorent
{
	String ownerName;
	String[] specialItems;
	
	
	 void showInfo(String ownerName,String[] specialItems)
	{
		System.out.println("Starting the restorentTop in the Restorent");
		this.ownerName=ownerName;
		System.out.println("ownerName:"+ownerName);
		this.specialItems=specialItems;
		System.out.println("ownerName:"+specialItems);
		
		
		if(this.specialItems!=null)
		{
			for(int seq=0; seq<this.specialItems.length; seq++)
				
				{
					String items=specialItems[seq];
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