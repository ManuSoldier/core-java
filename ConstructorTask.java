class ConstructorTask
{
		public static void main (String args[])

	{
		Keyboard keyboard=new Keyboard("asus");
		Keyboard keyboard1=new Keyboard("asus","blue");
		Keyboard keyboard2=new Keyboard("asus","blue",200);
		Keyboard keyboard3=new Keyboard("asus","blue",200,"wired");
		Keyboard keyboard4=new Keyboard("asus","blue",200,"wired",599.0);
		
		
		MatchBox matchBox=new MatchBox("pigion");
		MatchBox matchBox1=new MatchBox("pigion",200);
		MatchBox matchBox2=new MatchBox("pigion",200,15);
		MatchBox matchBox3=new MatchBox("pigion",200,15,20);
		MatchBox matchBox4=new MatchBox("pigion",200,15,20,5);
		MatchBox matchBox5=new MatchBox("pigion",200,15,20,5,10);
		MatchBox matchBox6=new MatchBox("pigion",200,15,20,5,10,'S');
		
		ShowRoom showRoom=new ShowRoom("veerabareshwara traders");
		ShowRoom showRoom1=new ShowRoom("veerabareshwara traders","Manoj");
		ShowRoom showRoom2=new ShowRoom("veerabareshwara traders","Manoj",'B');
		ShowRoom showRoom3=new ShowRoom("veerabareshwara traders","Manoj",'B',"yamaha");
		ShowRoom showRoom4=new ShowRoom("veerabareshwara traders","Manoj",'B',"yamaha","Davanegere");
		ShowRoom showRoom5=new ShowRoom("veerabareshwara traders","Manoj",'B',"yamaha","Davanegere",577530);
		ShowRoom showRoom6=new ShowRoom("veerabareshwara traders","Manoj",'B',"yamaha","Davanegere",577530,7338198809l);
		ShowRoom showRoom7=new ShowRoom("veerabareshwara traders","Manoj",'B',"yamaha","Davanegere",577530,7338198809l,true);
	}
}