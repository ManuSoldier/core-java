class  Wallet
{
	String brand;
	boolean Saftey;
	char type;
	String ShopName;
	
	
	 Wallet()
	 {
			super();
	 }
	 
	 
	 Wallet(String brand)
	 {
			super();
			System.out.println("we created only the brand:"+brand);
			this.brand=brand;
	 }
	 
	 
	 Wallet(String brand, boolean Saftey)
	 {
			super();
			System.out.println("we created the Wallet brand and Saftey:"+brand+","+Saftey);
			this.brand=brand;
			this.Saftey=Saftey;
	 }
	 
	 
	 Wallet(String brand,boolean Saftey, char type)
	 {
			super();
			System.out.println("we created the Wallet brand,Saftey,type and ShopName:"+brand+","+Saftey+","+type);
			this.brand=brand;
			this.Saftey=Saftey;
			this.type=type;
	 }
	 
	 
	 Wallet(String brand, boolean Saftey, char type, String ShopName)
	 {
		 
			System.out.println("we created the Wallet brand,Saftey,type,ShopName and ShopName:"+brand+","+Saftey+","+type+","+ShopName);
			this.brand=brand;
			this.Saftey=Saftey;
			this.type=type;
			this.ShopName=ShopName;
	 }	 
}