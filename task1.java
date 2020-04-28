import java.util.Scanner;
public class task1
{
    public static void main(String[] args)
    {
        int i,j,k;
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number");
          k= s1.nextInt();
        
        for (i=(-k+1);i<k; i++)
        {
            k = Math.abs(i)+1;
            for(j=(2-k%2);j<=k;j+=2)
            {
                if(k%2==1)
                    System.out.print((char)(65+(j/2))+" ");
                else
                    System.out.print(" "+(char)(65+(26-(j/2))));
            }
            System.out.println("");
        }
    }
}
