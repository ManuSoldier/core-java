class LaminatedGlass extends Glass
{
	double cost;
	double warranty;
	
	
	LaminatedGlass(double length,String thickness,Glass1 glass,double usage,String brand,double cost,double warranty)
	{
		super(length,thickness,glass,usage,brand);
		this.cost=cost;
		this.warranty=warranty;
		System.out.println("Length:"+this.length);
		System.out.println("Thickness:"+this.thickness);
		System.out.println("Glass1:"+this.glass);
		System.out.println("Usage:"+this.usage);
		System.out.println("Brand:"+this.brand);
		System.out.println("Creating the contrsuctor in the Glass");
	}
}