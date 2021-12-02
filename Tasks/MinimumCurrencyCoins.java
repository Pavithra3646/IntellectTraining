package projecteuler;
import java.util.Scanner;
public class numberOfcurrencynotes {

	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      
	      System.out.println("Enter a rupees :");
	      int n=sc.nextInt();
	      
	      int[] arr= new int[] {100,50,10,5,2,1};
	      int count=0;
	      for(int i=0;i<6;i++) {
	    	
	    	  count+=n/arr[i];
	    	  n=n%arr[i];
	    	  
	      }
	    		  System.out.println("Minimum Currency notes are : "+count);
	    		
	   }

}
