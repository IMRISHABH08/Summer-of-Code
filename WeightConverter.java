import java.util.Scanner;
public class WeightConverter
{
   
    public static void main(String[] args)
    {
	 int i,j;
   	 double k=0;
        Scanner s1=new Scanner(System.in);

     do
     {
        System.out.println("***WEIGHT CONVERSION TOOL***\n");
        System.out.println("CONVERT FROM ==>\n 1.kilogram\n 2.gram\n 3.milligram\n 4.tons\n 5.centigram\n 6.microgram\n ENTER THE NUMBER:->");
        i=s1.nextInt();

        switch(i)
        {
            case 1:
                   {
		    System.out.println("\n ENTER THE VALUE HERE ==>");
                    k=s1.nextDouble();
                    k=k;
                    break;
		   }
            case 2:
                    System.out.println("\n ENTER THE VALUE HERE ==>");
                    k=s1.nextDouble();
	            k=k/1000;
                    break;
            case 3:
		   {
                    System.out.println("\n ENTER THE VALUE HERE ==>");
                    k=s1.nextDouble();
                    k=k/1000000;
                    break;
		   }
            case 4:
                   {
		    System.out.println("\n ENTER THE VALUE HERE ==>");
                    k=s1.nextDouble();
                    k=k*1000;
                    break;  
		   } 
             case 5:
                   {
                    System.out.println("\n ENTER THE VALUE HERE ==>");
                    k=s1.nextDouble();
                    k=k/100000;
                    break;
                   }        
            case 6: 
                   {
                    System.out.println("\n ENTER THE VALUE HERE ==>");
                    k=s1.nextDouble();
                    k=k/1000000000;
                    break;
                   }
             default:
		    {
                     System.out.println("\n ENTER THE VALID NUMBER :");
                     
		    }
     
        }

            if(i>=1 && i<=6)
            {
                System.out.println("CONVERT TO ==>\n 1.kilogram\n 2.gram\n 3.milligram\n 4.tons\n 5.centigram\n 6.microgram\n ENTER THE NUMBER:->");
                j=s1.nextInt();

                switch(j)
                {
                    case 1:
                            k=k;
                            System.out.println(" value in kilograms"+k);
                            break; 
                    case 2:
			  
			    k=k*1000;
                            System.out.println("value in grams"+k);
			   
                            break;
                    case 3:
                            k=k*1000000;
			    System.out.println("value in milligram "+k);
                            break;    
                    case 4:
			    k=k/1000;
                            System.out.println("value in tons "+k);
                            break;   
                    case 5:
			    k=k*100000;	
                            System.out.println("value in centigram "+k);
                            break;     
                    case 6:
			    k=k*1000000000;	
                            System.out.println("value in microgram "+k);
                            break;       
                    default:
                            System.out.println("invalid conversion");
                            break;                             
                }
            }
            else
            {
                System.out.println("");
                break;
            }

     }while(i!=7);
    
    }
    
     

}
                