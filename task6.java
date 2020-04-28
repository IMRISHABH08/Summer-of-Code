import java.util.Scanner;
public class task6 
{
	public static void main(String[] args) 
    	{
		int i,j,a;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter a number ");
		a =s1.nextInt();
		for(i = 1; i <= a; i++) 
        	{
			for(j=i; j>1; j--) 
            		{
				System.out.print(" ");
			}

			for(j=i; j<=a; j++) 
            		{
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
		for( i=a; i>=1; i--) 
        	{
			for(j=i; j>1; j--) 
            		{
				System.out.print(" ");
			}
			for( j=i; j<=a; j++) 
            		{
				System.out.print(" "+j);
			}
			System.out.println("");
		}
	}

	
}