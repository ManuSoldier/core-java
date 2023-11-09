class Atm
{
	String bankName;
	String[] branch;
	String[] acs;
	String[] cctvBrands;
	
	
	 void showInfo(String bankName,String[] branch, String[] acs,String[] cctvBrands)
	{
		System.out.println("Starting the restorentTop in the Restorent");
		this.bankName=bankName;
		System.out.println("Name of bank:"+bankName);
		this.branch=branch;
		this.acs=acs;
		this.cctvBrands=cctvBrands;
		
		
		if(this.branch!=null)
		{
			for(int seq=0; seq<this.branch.length; seq++)
				
				{
					String items=branch[seq];
					System.out.println("branch:"+items);
				}

		}
		
		
		
		if(this.acs!=null)
		{
			for(int seq=0; seq<this.acs.length; seq++)
				
				{
					String items=acs[seq];
					System.out.println("acs:"+items);
				}

		}
		
		
		
		if(this.cctvBrands!=null)
		{
			for(int seq=0; seq<this.cctvBrands.length; seq++)
				
				{
					String items=cctvBrands[seq];
					System.out.println("cctvBrands:"+items);
				}

		}

		System.out.println("Starting the restorentTop in the Restorent");	
	}
}