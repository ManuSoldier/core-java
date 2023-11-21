class Camera
{
	String brand; 
	Color color;
	double pixels;
	double Batteryduration; 
	
	Camera(String brand,Color color,double pixels,double Batteryduration)
	{
		this.brand=brand;
		this.color=color;
		this.pixels=pixels;
		this.Batteryduration=Batteryduration;
		System.out.println("Creating the contrsuctor in the Camera");
		
	}
}