package codechefcp;
import java.util.*;

public class unique_digits {
	
	public static boolean digit_repeat_checker(int n) {
		
		ArrayList<Integer>li = new ArrayList<Integer>(); 
		
		while(n!=0) {
			
			if(!li.contains(n%10))
			
			{  li.add(n%10);
			    n=n/10;
			}
			
			else
				return true;
			   
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int count =0;
		
		System.out.println("Enter left range:");
		 
	      
	      int l =  s.nextInt();
	      
	      
      System.out.println("Enter right range:");
		 
	      
	      int r =  s.nextInt();
	      
	      for(int x=l; x<=r; x++) {
	    	  
	    	  if(!digit_repeat_checker(x))
	    		  count++;
	      }
	      
	      
	      System.out.println(count);
	      
	}

}
