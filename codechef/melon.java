// code-melon .  prb is if the sum of some elements can be made 0 by any no of operations. these operations contain element - its index.
// 	Eg. -1,4    (-1-1)+(4-2)=0



package assignments;
import java.util.*;

public class partitioning_set {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		
		 int t=0;
       
//         if(s.hasNextInt())    ----- ---  -- ----> these lines are for exception handling in online compiler
//             t=s.nextInt();
		
		for(int k=0;k<t; k++) 
		{
		
		int sum_elments=0,sum_numbers=0; 
		
		
		int n= s.nextInt();   int element[]=new int[n]; int numbers[]=new int[n];
		
		for(int i=0; i<n; i++) 
		{
			numbers[i]=s.nextInt();
			element[i]=i+1;
			sum_elments= sum_elments+element[i];
			sum_numbers=sum_numbers+numbers[i];
		}
		
		if(sum_numbers == 0 )
			System.out.println("YES");
		else if(sum_numbers < 0 )
			System.out.println("NO");
			
		else {	
		 int x=sum_elments;
		
//		Arrays.sort(element);
		
		int arr[][]= new int[n][x+1]; 
		
		
		for(int i=0; i<n; i++) 
		{
			
			arr[i][0]=1;
			
		}
		

		for(int i=1; i<=x; i++) 
		{ 
			if(i==element[0])
				arr[0][i]=1;
			
			else	
			   arr[0][i]=0;
			
		}
		
		for(int i=1;i<n;i++)
		 {for(int j=1;j<=x;j++)
		   { 
			 if(element[i-1]==j)
			   arr[i][j]= 1; 
		     
		   else if(element[i-1]>j)
			   arr[i][j]= arr[i-1][j] ;
		    	 
		   
		   
		     else
		    	 arr[i][j]= arr[i-1][j-element[i]];
			 
			 
//			 System.out.println(arr[i][j]);
			 
		   }
				
		 }
		
		  if(arr[n-1][x]==1)
			  {System.out.println("YES ");}
		  else if(arr[n-1][x]==0)
		   { System.out.println("NO ");}
		  
		
		
		}
		
		

		}
		
		
		

	}

}
