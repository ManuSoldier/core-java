class  MatchBox
{
	String brand;
	double noOfSticks;
	double length;
	double price;
	double size;
	double weight;
	char type;
	
	 MatchBox()
	 {
			System.out.println("we created only the brand:"+brand);
	 }
	 
	 
	 MatchBox(String brand)
	 {
			System.out.println("we created only the brand:"+brand);
			this.brand=brand;
	 }
	 
	 
	 MatchBox(String brand, double noOfSticks)
	 {
	 System.out.println("we created the MatchBox brand and noOfSticks:"+brand+","+noOfSticks);
	 this.brand=brand;
	 this.noOfSticks=noOfSticks;
	 }
	 
	 
	 MatchBox(String brand, double noOfSticks, double length)
	 {
	 System.out.println("we created the MatchBox brand,noOfSticks and length:"+brand+","+noOfSticks+","+length);
	 this.brand=brand;
	 this.noOfSticks=noOfSticks;
	 this.length=length;
	 }
	 
	 
	 	  MatchBox(String brand, double noOfSticks, double length, double price)
	 {
	 System.out.println("we created the MatchBox brand,noOfSticks,length and price:"+brand+","+noOfSticks+","+length+","+price);
	 this.brand=brand;
	 this.noOfSticks=noOfSticks;
	 this.length=length;
	 this.price=price;
	 }
	 
	 
	 MatchBox(String brand, double noOfSticks, double length,double price, double size)
	 {
	 System.out.println("we created the MatchBox brand,noOfSticks,length,price and size:"+brand+","+noOfSticks+","+length+","+price+","+size);
	 this.brand=brand;
	 this.noOfSticks=noOfSticks;
	 this.length=length;
	 this.price=price;
	 this.size=size;
	 }
	 
	 
	 MatchBox(String brand, double noOfSticks, double length,double price, double size, double weight)
	 {
	 System.out.println("we created the MatchBox brand,noOfSticks,length,price,size and weight:"+brand+","+noOfSticks+","+length+","+price+","+size+","+weight);
	 this.brand=brand;
	 this.noOfSticks=noOfSticks;
	 this.length=length;
	 this.price=price;
	 this.size=size;
	 this.weight=weight;
	 }
	 	 
	 
	  MatchBox(String brand, double noOfSticks, double length,double price, double size,  double weight, char type)
	 {
	 System.out.println("we created the MatchBox brand,noOfSticks,length and size:"+brand+","+noOfSticks+","+length+","+price+","+size+","+weight+","+type);
	 this.brand=brand;
	 this.noOfSticks=noOfSticks;
	 this.length=length;
	 this.price=price;
	 this.size=size;
	 this.weight=weight;
	 this.type=type;
	 }
	 
}