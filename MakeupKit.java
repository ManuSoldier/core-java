class  MakeupKit
{
	String brand;
	String content;
	char type;
	String ShopName;
	
	
	 MakeupKit()
	 {
			super();
	 }
	 
	 
	 MakeupKit(String brand)
	 {
			super();
			System.out.println("we created only the brand:"+brand);
			this.brand=brand;
	 }
	 
	 
	 MakeupKit(String brand, String content)
	 {
			super();
			System.out.println("we created the MakeupKit brand and content:"+brand+","+content);
			this.brand=brand;
			this.content=content;
	 }
	 
	 
	 MakeupKit(String brand,String content, char type)
	 {
			super();
			System.out.println("we created the MakeupKit brand,content,type and ShopName:"+brand+","+content+","+type);
			this.brand=brand;
			this.content=content;
			this.type=type;
	 }
	 
	 
	 MakeupKit(String brand, String content, char type, String ShopName)
	 {
		 
			System.out.println("we created the MakeupKit brand,content,type,ShopName and ShopName:"+brand+","+content+","+type+","+ShopName);
			this.brand=brand;
			this.content=content;
			this.type=type;
			this.ShopName=ShopName;
	 }	 
}