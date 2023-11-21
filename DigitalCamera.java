class DigitalCamera extends Camera
{
		DigitalCamera(String brand,Color color,double pixels,double Batteryduration)
	{
		super(brand,color,pixels,Batteryduration);
		System.out.println("Brand:"+this.brand);
		System.out.println("Color:"+this.color);
		System.out.println("Pixels:"+this.pixels);
		System.out.println("Batteryduration:"+this.Batteryduration);
		System.out.println("Creating the contrsuctor in the DigitalCamera");
		
	}
}