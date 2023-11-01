class  Ornament
{
	String brand;
	String location;
	char type;
	String ShopName;
	
	
	 Ornament()
	 {
			super();
	 }
	 
	 
	 Ornament(String brand)
	 {
			super();
			System.out.println("we created only the brand:"+brand);
			this.brand=brand;
	 }
	 
	 
	 Ornament(String brand, String location)
	 {
			super();
			System.out.println("we created the Ornament brand and location:"+brand+","+location);
			this.brand=brand;
			this.location=location;
	 }
	 
	 
	 Ornament(String brand,String location, char type)
	 {
			super();
			System.out.println("we created the Ornament brand,location,type and ShopName:"+brand+","+location+","+type);
			this.brand=brand;
			this.location=location;
			this.type=type;
	 }
	 
	 
	 Ornament(String brand, String location, char type, String ShopName)
	 {
		 
			System.out.println("we created the Ornament brand,location,type,ShopName and ShopName:"+brand+","+location+","+type+","+ShopName);
			this.brand=brand;
			this.location=location;
			this.type=type;
			this.ShopName=ShopName;
	 }	 
}