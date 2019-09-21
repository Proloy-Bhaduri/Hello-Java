/* ASSIGNMENT - 1 : 
  Q. 4) Write a java program to print the first N non-prime numbers

   Solution Made by Proloy Bhaduri
 /*Solution: */ 
  import java.util.*;
  public  class  FirstNnonprime
  		{
  			public static void main(String pb99[])
  				{
  					int i=2,k,j,n;
  					Scanner np = new Scanner(System.in);// object creation  style in java
  					System.out.println("Enter Number Range limit");
                                        n = np.nextInt();
  				        System.out.println("First "+n+" non-prime numbers are :");
  				        for(k=n;k>0;)
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
