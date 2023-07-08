class Fab 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		System.out.print(a + " "+b);
		int i=5;
		for(int j=0;j<=i;j++){
			int c =a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}
}
