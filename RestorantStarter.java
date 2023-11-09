class RestorantStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting the main in the RestoantStarter");
		Restorent restorent=new Restorent();
		String[] items={"veg Biriyani Rice", "Gee Rice", "Masala Rice", "Egg Rice", "Rice Bhath"};
		restorent.showInfo("manoj",items);
		System.out.println("Ending the main in the RestoantStarter");
		
	}


}