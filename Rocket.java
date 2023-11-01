class  Rocket
{
	String Name;
	String Country;
	char type;
	String Company;
	
	
	 Rocket()
	 {
			super();
	 }
	 
	 
	 Rocket(String Name)
	 {
			super();
			System.out.println("we created only the Name:"+Name);
			this.Name=Name;
	 }
	 
	 
	 Rocket(String Name, String Country)
	 {
			super();
			System.out.println("we created the Rocket Name and Country:"+Name+","+Country);
			this.Name=Name;
			this.Country=Country;
	 }
	 
	 
	 Rocket(String Name,String Country, char type)
	 {
			super();
			System.out.println("we created the Rocket Name,Country,type and company:"+Name+","+Country+","+type);
			this.Name=Name;
			this.Country=Country;
			this.type=type;
	 }
	 
	 
	 Rocket(String Name, String Country, char type, String Company)
	 {
		 
			System.out.println("we created the Rocket Name,Country,type,company and Company:"+Name+","+Country+","+type+","+Company);
			this.Name=Name;
			this.Country=Country;
			this.type=type;
			this.Company=Company;
	 }	 
}