class Brand
{
		String name;
		String origin;
		String ceoName;
		Cities[] cities;
		
		void setInfo(String name, String origin, String ceoName, Cities[] cities)
		{
			this.name=name;
			this.origin=origin;
			this.ceoName=ceoName;
			this.cities=cities;
		}
		void showInfo()
		{	
			System.out.println("starting the class of brand");
			System.out.println("name:"+name);
			System.out.println("origin:"+origin);
			System.out.println("ceoName:"+ceoName);
			
			
			if(this.cities!=null)
			{
				for(int seq=0; seq<this.cities.length; seq++)
				{
					Cities items=cities[seq];
					items.showInfo();
				}
			}
			else
			{
				System.out.println("the statement us wrong");
			}
			System.out.println("ending the class of brand");
			
		}

}