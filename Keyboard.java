class  Keyboard
{
	String brand;
	String color;
	int noOfKeys;
	String type;
	double cost;
	
	 Keyboard()
	 {
			System.out.println("we created only the brand:"+brand);
	 }
	 
	 
	 Keyboard(String brand)
	 {
			System.out.println("we created only the brand:"+brand);
			this.brand=brand;
	 }
	 
	 
	 Keyboard(String brand, String color)
	 {
	 System.out.println("we created the Keyboard brand and color:"+brand+","+color);
	 this.brand=brand;
	 this.color=color;
	 }
	 
	 
	 Keyboard(String brand, String color,int noOfKeys)
	 {
	 System.out.println("we created the Keyboard brand, color and noOfKeys:"+brand+","+color+","+noOfKeys);
	 this.brand=brand;
	 this.color=color;
	 this.noOfKeys=noOfKeys;
	 }
	 
	 
	 Keyboard(String brand, String color,int noOfKeys, String type)
	 {
	 System.out.println("we created the Keyboard brand,color,noOfKeys and type:"+brand+","+color+","+noOfKeys+","+type);
	 this.brand=brand;
	 this.color=color;
	 this.noOfKeys=noOfKeys;
	 this.type=type;
	 }
	 
	 
	 Keyboard(String brand, String color,int noOfKeys, String type, double cost)
	 {
	 System.out.println("we created the Keyboard brand,color,noOfKeys and type:"+brand+","+color+","+noOfKeys+","+type+","+cost);
	 this.brand=brand;
	 this.color=color;
	 this.noOfKeys=noOfKeys;
	 this.type=type;
	 this.cost=cost;
	 }
}