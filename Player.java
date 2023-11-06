class Player
{
		String name;
		Game game=new Game(102, "Cricket", "india");
		
		void setName(String name)
		{
			this.name=name;
		}
		void showInfo()
			{
				System.out.println("starting the setName in Player");
				System.out.println("name is:"+name);
				System.out.println("game name is:"+game.name);
				game.play();
				game.pause();
				game.end();				
				System.out.println("ending the setName in Player");
			}
}