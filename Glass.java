class Glass
{
	double length;
	String thickness;
	Glass1 glass;
	double usage;
	String brand;
	
	
	Glass(double length,String thickness,Glass1 glass,double usage,String brand)
	{
		this.length=length;
		this.thickness=thickness;
		this.glass=glass;
		this.usage=usage;
		this.brand=brand;
		System.out.println("Creating the contrsuctor in the Glass");
	}
}