class  Agent
{
	int id=101;
	String name="Manoj";
	String company="KarunaduTech";
	Tent tent;
	
	void openTent(Tent tent)
	{
		this.tent=tent;
		System.out.println("starting openTent in the Agent");
		System.out.println("sl no is:"+tent.slNo);
		System.out.println("width is:"+tent.width);
		System.out.println("height is:"+tent.height);
		tent.open();
		System.out.println("ending openTent in the Agent");
	}	
		
	void closeTent(Tent tent)
	{
		this.tent=tent;
		System.out.println("starting closeTent in the Agent");
		System.out.println("sl no is:"+tent.slNo);
		System.out.println("width is:"+tent.width);
		System.out.println("height is:"+tent.height);
		tent.close();
		System.out.println("ending closeTent in the Agent");		
	}
	
	
	void showInfo()
	{
		System.out.println("starting showInfo in the Agent");
		openTent(tent);
		closeTent(tent);
		System.out.println("the id is:"+id);
		System.out.println("the name is:"+name);
		System.out.println("the company is:"+company);		
		System.out.println("starting showInfo in the Agent");
	}
	
}