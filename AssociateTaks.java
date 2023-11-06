class AssociateTaks
{
	public static void main(String args[])
	{
		System.out.println("Starting main in the AssociateTaks" );
		Tent tent=new Tent();
		Agent agent=new Agent();
		System.out.println("Starting openTent in the AssociateTaks" );
		agent.openTent(tent);
		System.out.println("Starting close in the AssociateTaks");
		agent.closeTent(tent);
		System.out.println("Starting showInfo in the AssociateTaks" );
		agent.showInfo();
		System.out.println("Ending main in the AssociateTaks" );
		
		
		System.out.println("\n Starting main in the AssociateTaks" );
		Game game=new Game(102, "Cricket", "india");
		game.showInfo();
		Player player=new Player();
		player.setName("Dhoni");
		player.showInfo();	
		System.out.println("ending main in the AssociateTaks" );		
	}

}