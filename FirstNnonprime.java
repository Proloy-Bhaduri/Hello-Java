/* ASSIGNMENT - 1 : 
  Q. 4) Write a java program to print the first N non-prime numbers

   Solution Made by Proloy Bhaduri
 /*Solution: */ 
  import java.util.*;
  public  class  FirstNnonprime
  		{
  			public static void main(String pb99[])
  				{
  					int i=0,j,n;
  					Scanner np = new Scanner(System.in);
  					System.out.println("Enter Number Range limit");
                                        n = np.nextInt();
                                        int k=n;
  				        System.out.println("First "+n+" non-prime numbers are :");
  				        for(;k>0;)
  					{     
  						i++; 
  						for(j = 2;j<=i/2;++j)
  						   {
                                                     if(i%j == 0 )
  						       {
                                                        System.out.printf(i+" ");
  						       	k--;
  						       	break;
  						        }
  						    }//end of inner loop
  				  }//end of outer loop
  				}//end of main
  		} //end of class
