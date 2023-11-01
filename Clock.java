class  Clock
{
	String Brand;
	String ShopName;
	char type;
	String place;
	
	
	 Clock()
	 {
			super();
	 }
	 
	 
	 Clock(String Brand)
	 {
			super();
			System.out.println("we created only the Brand:"+Brand);
			this.Brand=Brand;
	 }
	 
	 
	 Clock(String Brand, String ShopName)
	 {
			super();
			System.out.println("we created the Clock Brand and ShopName:"+Brand+","+ShopName);
			this.Brand=Brand;
			this.ShopName=ShopName;
	 }
	 
	 
	 Clock(String Brand,String ShopName, char type)
	 {
			super();
			System.out.println("we created the Clock Brand,ShopName,type and company:"+Brand+","+ShopName+","+type);
			this.Brand=Brand;
			this.ShopName=ShopName;
			this.type=type;
	 }
	 
	 
	 Clock(String Brand, String ShopName, char type, String place)
	 {
		 
			System.out.println("we created the Clock Brand,ShopName,type,company and place:"+Brand+","+ShopName+","+type+","+place);
			this.Brand=Brand;
			this.ShopName=ShopName;
			this.type=type;
			this.place=place;
	 }	 
}