class AtmStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting the main in the RestoantStarter");
		Atm atm=new Atm();
		String[] branch={"btm layout", "rajajinagar", "ragigudda", "jayanagar", "banashakari"};
		String[] acs={"butterfly", "pristige", "samsung"};
		String[] cctvBrands={"samsung", "sony", "phliphs", "hostsun","bosh"};
		atm.showInfo("canara",branch,acs,cctvBrands);
		System.out.println("Ending the main in the RestoantStarter");
		
	}


}