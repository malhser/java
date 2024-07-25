import java.util.Scanner;
class Factorl
{ 
	public static void main(String arg[])	
	{
	   long n;
             	
           Scanner sc=new Scanner(System.in);
 
	   System.out.println("enter number");
	   
           n=sc.nextLong();
 
	   long f=Factorl.fact(n);
 
	   System.out.println("factorial="+f);
	}
 
	static long fact(long n)
	 {
	     if(n<=0)
	      return 1;
	      
              return Factorl.fact(n-1)*n; 
	}
  	        	 
}
