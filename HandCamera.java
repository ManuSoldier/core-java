class HandCamera extends Camera
{
		double weight;
		
		
		
		HandCamera(String brand,Color color,double pixels,double Batteryduration,double weight)
	{
		super(brand,color,pixels,Batteryduration);
		this.weight=weight;
		System.out.println("Brand:"+this.brand);
		System.out.println("Color:"+this.color);
		System.out.println("Pixels:"+this.pixels);
		System.out.println("Batteryduration:"+this.Batteryduration);
		System.out.println("Creating the contrsuctor in the HandCamera");
		
	}
}