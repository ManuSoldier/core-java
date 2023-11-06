class Tent
{
	int slNo;
	enum Color
	{
		PURPLE,BLACK,BLUE,GREEN,RED,GREY,WHITE,PINK;	
	}
	double width=150,height=180;
	
	
	boolean open()
	{
	System.out.println("starting the open in the Tent");
	System.out.println("the open method is running");
	System.out.println("ending the open in the Tent");
	return true;			
	}
	
	
	boolean close()
	
	{
	System.out.println("starting the open in the Tent");
	System.out.println("the close method is running");
	System.out.println("ending the open in the Tent");
	return false;			
	}
	
	
	void showInfo()
	{
	System.out.println("starting the  in showInfo the Tent");	
	System.out.println("slNo of:"+slNo);
	Color color=Color.BLUE;
	System.out.println("name of the color:"+color);
	System.out.println("the width is:"+width);
	System.out.println("the height is:"+height);
	open();
	close();
	System.out.println("ending the  in showInfo the Tent");		
	}
}