class  ShowRoom
{
	String name;
	String owenerName;
	char type;
	String company;
	String place;
	double pin;
	long contact;
	boolean loss;
	
	
	 ShowRoom()
	 {
			System.out.println("we created only the name:"+name);
	 }
	 
	 
	 ShowRoom(String name)
	 {
			System.out.println("we created only the name:"+name);
			this.name=name;
	 }
	 
	 
	 ShowRoom(String name, String owenerName)
	 {
	 System.out.println("we created the ShowRoom name and owenerName:"+name+","+owenerName);
	 this.name=name;
	 this.owenerName=owenerName;
	 }
	 
	 
	 ShowRoom(String name, String owenerName, char type)
	 {
	 System.out.println("we created the ShowRoom name,owenerName and type:"+name+","+owenerName+","+type);
	 this.name=name;
	 this.owenerName=owenerName;
	 this.type=type;
	 }
	 
	 
	 	  ShowRoom(String name,String owenerName, char type, String company)
	 {
	 System.out.println("we created the ShowRoom name,owenerName,type and company:"+name+","+owenerName+","+type+","+company);
	 this.name=name;
	 this.owenerName=owenerName;
	 this.type=type;
	 this.company=company;
	 }
	 
	 
	 ShowRoom(String name, String owenerName, char type,String company, String place)
	 {
	 System.out.println("we created the ShowRoom name,owenerName,type,company and place:"+name+","+owenerName+","+type+","+company+","+place);
	 this.name=name;
	 this.owenerName=owenerName;
	 this.type=type;
	 this.company=company;
	 this.place=place;
	 }
	 
	 
	 ShowRoom(String name,String owenerName,char type,String company, String place, double pin )
	 {
	 System.out.println("we created the ShowRoom name,owenerName,type,company,place and pin:"+name+","+owenerName+","+type+","+company+","+place+","+pin);
	 this.name=name;
	 this.owenerName=owenerName;
	 this.type=type;
	 this.company=company;
	 this.place=place;
	 this.pin=pin;
	 }
	 	 
	 
	  ShowRoom(String name, String owenerName, char type,String company, String place, double pin, long contact)
	 {
	 System.out.println("we created the ShowRoom name,owenerName,type ,place,pin and contact:"+name+","+owenerName+","+type+","+company+","+place+","+pin+","+contact);
	 this.name=name;
	 this.owenerName=owenerName;
	 this.type=type;
	 this.company=company;
	 this.place=place;
	 this.pin=pin;
	 this.contact=contact;
	 }
	 
	 
	 
		ShowRoom(String name,String owenerName, char type,String company, String place, double pin, long contact, boolean loss)
	 {
	 System.out.println("we created the ShowRoom name,owenerName,type,place,pin,contact and  loss:"+name+","+owenerName+","+type+","+company+","+place+","+pin+","+contact+","+loss);
	 this.name=name;
	 this.owenerName=owenerName;
	 this.type=type;
	 this.company=company;
	 this.place=place;
	 this.pin=pin;
	 this.contact=contact;
	 }
	 
}