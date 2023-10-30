class Sum
{
	public static void main(String[] any)
	{
		int[] sum={2,7,11,15};
		for(int i=0;i<=sum.length-1;i++)
		{
			for(int j=i+1;i<=sum.length-1;i++)
			{
				
			int t=sum[i]+sum[j];
			if(t==9)
			{
				System.out.println("The no add up to the target value 9 is");
				System.out.println(i+" "+j);
			}
		}
	}
	
}
}