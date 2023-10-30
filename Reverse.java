class Reverse
{
	public static void main(String[] args) 

		{
		int array[]={1,2,3,4,5}, temp[]={0,0,0,0,0}; 
		for(int i=0; i<array.length; i++)
		{
		if(i+2<array.length)
		{
			temp[i+2]=array[i];
		}
		else
		{
		for(int j=0; j<2; j++)
		{
		temp[j]=array[i];
		i++;
		}			
		}
		}
		System.out.println("After changing array element");
		for(int j=0; j<array.length; j++)
		{
		System.out.print(temp[j]);
		}
		}
		

}