class PersonStarter
{
	public static void main(String... Persons)
	{
		System.out.println("Starting main in the PersonStarter");
		Project project=new Project();
		Person person=new Person();
		project.validate(person);
		
		Developer developer=new Developer();
		project.validate(developer);
		
		BusinessAnalyst businessAnalyst=new BusinessAnalyst();
		project.validate(businessAnalyst);
		
		
		ProductOwner productOwner=new ProductOwner();
		project.validate(productOwner);
		
		Devops devops=new Devops();
		project.validate(devops);
		
		Tester tester=new Tester();
		project.validate(tester);
		
		DataBaseDeveloper dataBaseDeveloper=new DataBaseDeveloper();
		project.validate(dataBaseDeveloper);		
	}	
}