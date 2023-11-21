class GlassStarter
{
	public static void main(String... args)
	{
		System.out.println("Running main in the GlassStarter");
		TintedGlass tintedGlass=new TintedGlass(20,"good",Glass1.HINDUSTHAN,12,"Twinkle",1200,"Manoj");
		GorrilaGlass gorrilaGlass=new GorrilaGlass(18,"Medium",Glass1.ASAYI,13,"Dream",10,2);
		System.out.println("Ending main in the GlassStarter");
	}
}