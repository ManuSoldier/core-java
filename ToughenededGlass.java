class ToughenededGlass extends Glass
{
	double weight;
	String OwnerName;
	
	
	
	ToughenededGlass(double length,String thickness,Glass1 glass,double usage,String brand,double weight,String OwnerName)
	{
		super(length,thickness,glass,usage,brand);
		this.weight=weight;
		this.OwnerName=OwnerName;
		System.out.println("Length:"+this.length);
		System.out.println("Thickness:"+this.thickness);
		System.out.println("Glass1:"+this.glass);
		System.out.println("Usage:"+this.usage);
		System.out.println("Brand:"+this.brand);
		System.out.println("Weight:"+this.weight);
		System.out.println("OwnerName:"+this.OwnerName);
		System.out.println("Creating the contrsuctor in the ToughenededGlass");
	}
}