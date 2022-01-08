package Package1;

public class myClass 
{
	
	
	
	public static int factorial(int n)
	{
		int i=1;
		int fact=1;
		
		for (i=1;i<=n;i++)
			fact=fact*i;
		return fact;
		
	}
	
	public static int nPr(int n, int r) {
		
		int permutation = factorial(n) / factorial(n-r);
		return permutation;
		
	}
	
	public static int nCr(int n, int r) {
		
		int combination = factorial(n) / (factorial(n-r)*factorial(r));
		return combination;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*int i=1;
		
		while (i<=5)
		{
			
			System.out.println("Hello");
			i++;
		} */
		
		/*int q=1;
		int d=0;
		
		if (q==1)
			d=0;
		else if (q==2)
			d=20;
		else if(q>=3)
			d=40;
		
		System.out.println(d);*/
		
		int i=1;
		
		/* for(i=1;i<=5;i++)
		{
			System.out.println("Hello");
			System.out.println("Hallo");
			i++;
		}
		}*/
		
		
		
		/*int n1=5;
		int fact1=1;
		
		for (i=1;i<=n1;i++)
			fact1=fact1*i;*/
		
		//*System.out.println(fact1);
		
		System.out.println(nPr(3,2));
		System.out.println(nCr(10,2));
			
	}
	

}
