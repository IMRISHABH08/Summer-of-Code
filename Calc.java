import java.util.Scanner;
public class Calc
{
    public static void main(String []args)
    {
        int l,n,i=0;
        char j;
        double s=0;
        Scanner s1=new Scanner(System.in);
        System.out.println("***ENTER y or Y TO START OR PRESS ANY KEY TO SKIP***");
        j = s1.next().charAt(0);

        if(j=='y'|| j=='Y' )
        {
            do
            {
                System.out.println("==ON==");
                System.out.println("=\n 1.ADDITION\n 2.SUBSTRACION\n 3.MULTIPLICATION\n 4.DIVISION\n ==SELECT OPTION==OR==PRESS ANY KEY TO TERMINATE:> ");
                l=s1.nextInt();   
                System.out.println("ENTER THE TOTAL NUMBER OF OPERANDS ");
                n=s1.nextInt();

                switch(l)
                {
                    case 1:
                   	{
			        	double arr[]=new double[n];
                        System.out.println("ENTER THE VALUE FOR EACH NUMBER");
                        for(i=0;i<n;i++)
                        {
            
                            arr[i]=s1.nextDouble();
                            s=s+arr[i];

                        }System.out.println("SUM ANS "+s);
                        break;
           	        }
                    case 2:
                	{
			            double arr[]=new double[n];
                        System.out.println("ENTER THE VALUE FOR EACH NUMBER"); 
                        for(i=0;i<n;i++)
        	            {
                            if(i==0)
                            {
                                arr[i]=s1.nextDouble();
                                s=s+arr[i];
                            }
                            else
                            {
                                arr[i]=s1.nextDouble();
                                s=s-arr[i];
                            }

             		    }System.out.println("SUBTRACTION ANS ==> "+s);
				        break;
             	    }
                    case 3:
 	                {
                        s=1;
                        double arr[]=new double[n];
                        System.out.println("ENTER THE VALUE FOR EACH NUMBER");
                        for(i=0;i<n;i++)
                        {
            
                            arr[i]=s1.nextDouble();
                            s=arr[i]*s;

                        }System.out.println("MULTIPLICATION ANS==>"+s);
        	             break;
          	        }
                    case 4:
 	                {
                        s=1;
                        double arr[]=new double[n];
                        System.out.println("ENTER THE VALUE FOR EACH NUMBER");
                        for(i=0;i<=arr.length-1;i++)
                        {
                            arr[i]=s1.nextDouble();
			    if(i>=1)
			    s=arr[i-1]/arr[i];
			    if(i>=1 && arr[i]==0)
			    {
                            	try
			    	{
                            		 s=arr[i]/arr[i+1];
                            	
                            	}
			    	catch(ArrayIndexOutOfBoundsException e)
			    	{
					System.out.println("array index out of bound ");
			   	}
			    }
                        }System.out.println("DIVISION ANS==>"+s);
                	}
		            default:
			        {
				            System.out.println("***ENTER A VALID CHOICE***");
				            break;	
				    }
                }
            }while(l!=5);
           
        }

        else
        {
            System.out.println("***ENTER Y TO START YOUR CALCULATOR***");
        }

    }
}












