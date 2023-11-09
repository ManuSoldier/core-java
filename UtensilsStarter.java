class UtensilsStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting the main in the UtensilsStarter");
		Canteen canteen=new Canteen();
		String[] items={"plate", "plastic plate", "bowl", "spoon", "gold plate", "silver plate", "fork","jar","mixy","thava","dose thava",
						"idli bOx","box", "tiffen Box", "bottel", "steel Bottel", "grinder", "stove", "stove lighter","knife", "slicer", 
						"samall plate", "cofee maker", "frige", "owen", "vessel", "stick","medium bowl", "Gee spoon", "oil spoon", "cooker",
						"rgg boiler", "veg cutter", "fruits cutter", "juice maker", "single stove", "glass", "tea glass", "jug", "mug"};
		canteen.showInfo("manoj",items);
		System.out.println("Ending the main in the UtensilsStarter");
		
	}


}