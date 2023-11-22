class Remote
{
	double totalButton;
	Remote1 remote;
	boolean orginal;
	
	Remote(double totalButton,Remote1 remote,boolean orginal)
	{
		System.out.println("starting the no-arg const in Remote");
		this.totalButton=totalButton;
		this.remote=remote;
		this.orginal=orginal;
	}
	
	
	void on()
	{
		System.out.println("Running the on method in the Remote");
	}
	
	
	void off()
	{
		System.out.println("Running the off method in the Remote");
	}
	
	void increaseVolume()
	{
		System.out.println("Running the increaseVolume method in the Remote");
	}
	
	
	void decreaseVolume()
	{
		System.out.println("Running the decreaseVolume method in the Remote");
	}
	
	
	void changeVolume()
	
	{
		System.out.println("Running the increaseVolume method in the Remote");
	}
	
}