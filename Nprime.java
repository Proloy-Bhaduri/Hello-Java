/* Write a java program to print the all non-prime numbers between 1 - N

   Solution Made by Proloy Bhaduri
 Solution: */ 
  import java.util.*;
  public  class  Nprime
  		{
  			public static void main(String args[])
  				{
  					int i,j,n;
  					Scanner np = new Scanner(System.in);
  					System.out.println("Enter Number Range limit");
                                        n = np.nextInt();
  					System.out.println("Non prime numbers in range 1 - " + n + " are :");
  					for(i=1;i<=n;i++)
  					{    
  						 int m = i/2;
  						for(j = 2;j<=m;++j)
  						   {
  						   	  if(i%j != 0 )continue;
  						       
  						         else 
  						          { 
  						           System.out.println(i);
  						           break;
  						           }
  						 }//end of inner loop
  				  }//end of outer loop
  				}//end of main
  		} //end of class
