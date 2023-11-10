class Cities
{
	String name;
	String stateName;
	
	void setInfo(String name, String stateName)
	{
		this.name=name;
		this.stateName=stateName;
	}
	void showInfo()
	{
		System.out.println("Starting the method in the class Cities");
		
		System.out.println("name:"+name);
		
		System.out.println("stateName:"+stateName);
		
		System.out.println("ending the method in the class Cities");
		
	}
}