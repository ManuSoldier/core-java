class RemoteStarter
{
	public static void main(String... args)
	{
		System.out.println("Starting the main in the RemoteStarter");
		LgRemote remote=new LgRemote(20,Remote1.DECRESEVALUME,true,45,7);
		remote.on();
		remote.off();
		remote.increaseVolume();
		remote.decreaseVolume();
		remote.changeVolume();
		remote.voiceCommand();
	}
}