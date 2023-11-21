class CameraStarter
{
	public static void main(String... args)
	{
		System.out.println("Running main in the CameraStarter");
		DigitalCamera digitalCamera=new DigitalCamera("Nickon",Color.BLUE,45,5);
		HandCamera handCamera=new HandCamera("Canon",Color.RED,45,5,20);
		System.out.println("Ending main in the CameraStarter");
	}
}