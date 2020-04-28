import java.util.Scanner;
public class task4 
{
    public static void main(String[] args)
    {
        int i,j,k;
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number");
        k = s1.nextInt();
        for(i=k;i>=1;i--)
        {
            for(j=i;j<=k;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
