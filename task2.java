import java.util.Scanner;
public class task2
 {
	public static void main(String[] args) 
    {
		int a,i,j,k,l;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a number ");
		a = s1.nextInt();
		for(i=1, k=10; i<=a; i++,k--) 
      	  	{
			for(j=1; j<=a; j++) 
            		{
				if(j<=k-i) 
                		{
					if(j==1 && i>=1 && i<=a) 
                    			{
						System.out.print(" "+i);
					} 
                    			else 
                    			{
						System.out.print(" "+j);
					}
				}
			}
			for(j=a+1,l=10; j<=a+4; j++) 
            		{
				if(j<=k-i) 
                		{
					System.out.print(" "+(l-j));
				}
			}System.out.println(" ");
			
		}
	}

	
}