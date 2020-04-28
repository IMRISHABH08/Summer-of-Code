import java.util.Scanner;
public class task5 
{
	public static void main(String[] args) 
    	{
		boolean k;
		int a;
        	Scanner s1=new Scanner(System.in);
		System.out.print("enter number");
		a = s1.nextInt();
		for(int i=1; i<=a; i++) 
       	 	{
		    if(i%2 == 0) 
            	    {
				k = true;
				for(int j = 1; j <= a + 6; j++) 
                		{
					if(j >= (a+1)-i && j<=a+(i-1) && k)
                    			{
						for(int n=1; n<=i && k; n=n+2)
                         			{
							System.out.print(n);
							k = false;
						}
					} 
                    			else 
                    			{
						System.out.print(" ");
						k = true;
					}
				}
				
			}
			if(i%2!=0) 
            		{
				k = true;
				for(int j=1; j<=a+6;j++) 
                		{
					if(j>=(a+1)-i && j<=a+(i-1) &&k) 
                    			{
						System.out.print("*");
						k = false;
					} 
                    			else 
                    			{
						System.out.print(" ");
						k = true;
					}
				}
				
			}System.out.println(" ");
		}
	}

}