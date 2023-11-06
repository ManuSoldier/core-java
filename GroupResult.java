class GroupResult
{
	public static void main(String[] any)
	{
				System.out.println("starting of main method");
				Speaker speaker=new Speaker(100);
				Tv1 tv=new Tv1(speaker,"sony oled");
				tv.showInfo();
				
				MenuCard menuCard=new MenuCard();
				menuCard.setDetails(10,200);
				Hotel hotel=new Hotel();
				hotel.setDetails("aradya","kumar",menuCard);
				hotel.showInfo();
				
				Job job=new Job();
				Company company=new Company(job);
				company.showInfo();
	}
}