class LgRemote extends Remote
{
	double warranty;
	double totalBatteries;
	
	
	LgRemote(double totalButton,Remote1 remote,boolean orginal,double warranty,double totalBatteries)
	{
		
		super(totalButton,remote,orginal);
		this.warranty=warranty;
		this.totalBatteries=totalBatteries;
		System.out.println("totalButton:"+totalButton);
		System.out.println("remote:"+remote);
		System.out.println("orginal:"+orginal);
		System.out.println("totalBatteries:"+totalBatteries);
		System.out.println("Starting the no-arg const in the LgRemote");
	}
	
	void voiceCommand()
	{
		System.out.println("Starting the voiceCommand method in the LgRemote");
	}
	
	
	@Override
	void on()
	{
		System.out.println("Running the on method overrided in the Remote");
	}
	
	
	@Override
	void off()
	{
		System.out.println("Running the off method overrided in the Remote");
	}
}