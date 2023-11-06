class Game
{
	int id;
	String name;
	enum TotalPlayers
	{
		ELEVEN, TWELVE, THIRTEEN, FOURTEEN;	
	}
	String origin;
	
	
	Game(int id, String name, String origin)
	{
		this.id=id;
		this.name=name;
		this.origin=origin;
	}
	
	
	void play()
	{
	System.out.println("starting the method in the game");
	System.out.println("the play method is running");
	System.out.println("ending the method in the game");			
	}
	
	
	void pause()	
	{
	System.out.println("starting the method in the game");
	System.out.println("the pause method is running");
	System.out.println("ending the method in the game");			
	}
	
	void end()	
	{
	System.out.println("starting the method in the game");
	System.out.println("the end method is running");
	System.out.println("ending the method in the game");			
	}
	
	
	void showInfo()
	{
	System.out.println("starting the  in showInfo the game");	
	System.out.println("id is:"+id);
	System.out.println("name:"+name);
	TotalPlayers Ttp=TotalPlayers.TWELVE;
	System.out.println("the no of TotalPlayers is:"+Ttp);
	play();
	pause();
	end();
	System.out.println("ending the  in showInfo the game");		
	}
}