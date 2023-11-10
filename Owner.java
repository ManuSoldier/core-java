class Owner
{
	String name;
	String eMail;
	String permanentAddress;
	String tempraryAddress;
	
	void setInfo(String name, String eMail, String permanentAddress, String tempraryAddress)
	{
		this.name=name;
		this.eMail=eMail;
		this.permanentAddress=permanentAddress;
		this.tempraryAddress=tempraryAddress;
	}
	void showInfo()
	{
		System.out.println("Starting the method in the class owner");
		
		System.out.println("name:"+name);
		
		System.out.println("eMail:"+eMail);
		
		System.out.println("permanentAddress:"+permanentAddress);
		
		System.out.println("tempraryAddress:"+tempraryAddress);
		
		System.out.println("ending the method in the class owner");
		
	}
}