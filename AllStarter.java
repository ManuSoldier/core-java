class AllStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting the main in the AllStarter");
		
		Cities cities=new Cities();
		cities.setInfo("banglore", "karnataka");
		
		Cities cities0=new Cities();
		cities0.setInfo("mysour", "karnataka");
		
		
		Cities cities1=new Cities();
		cities1.setInfo("mysour", "karnataka");
		
		Cities cities2=new Cities();
		cities2.setInfo("mysour", "karnataka");
		
		Cities cities3=new Cities();
		cities3.setInfo("mysour", "karnataka");
		
		Cities cities4=new Cities();
		cities4.setInfo("mysour", "karnataka");
	
		Cities[] items0={cities,cities0,cities1,cities2,cities3,cities4};
		
		Brand brand=new Brand();
		brand.setInfo("manoj", "year 1999", "kiran", items0);
		
		Adresss adresss=new Adresss();
		adresss.setInfo("jade mayasandra", 577530, cities4);
		
		Owner owner=new Owner();
		owner.setInfo("manoj", "manoj123@gmail.com", "btm", "rajajinagar");
		
		
		Hardware hardware=new Hardware();
		
		Hardware hardware0=new Hardware();
		hardware0.setInfo("keyboard", "wirless", brand);
		
		Hardware hardware1=new Hardware();
		hardware1.setInfo("mouse", "wirless", brand);
		
		Hardware hardware2=new Hardware();
		hardware2.setInfo("cpu", "wirless", brand);
		
		
		Hardware hardware3=new Hardware();
		hardware3.setInfo("dvdDrive", "wirless", brand);
		
		Hardware hardware4=new Hardware();
		hardware4.setInfo("mic", "wirless", brand);
		
		
		Hardware hardware5=new Hardware();
		hardware5.setInfo("ram", "wirless", brand);
		
		Hardware hardware6=new Hardware();
		hardware6.setInfo("soundcard", "wirless", brand);
		
		Hardware hardware7=new Hardware();
		hardware7.setInfo("hdd", "inbuilt", brand);
		
		Hardware hardware8=new Hardware();
		hardware8.setInfo("cpufan", "wired", brand);
		
		Hardware hardware9=new Hardware();
		hardware9.setInfo("main board", "wirless", brand);

		Hardware[] items1={hardware0,hardware1,hardware2,hardware3,hardware4,hardware5,hardware6,hardware7,hardware8,hardware9};
		hardware.setInfo("manoj", "wireless", brand);
		
		
		Laptop laptop=new Laptop();
		laptop.setInfo(items1, owner, brand);
		laptop.showInfo();
		
		System.out.println("Starting the main in the AllStarter");
	}
}
		
		
		
		
		
		