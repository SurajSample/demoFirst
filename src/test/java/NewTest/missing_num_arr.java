package NewTest;

import java.util.Arrays;

public class missing_num_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {2, 3, 5, 7}; 
	        Arrays.sort(arr); // Sort the array

	       
	        for (int i = 0; i < arr.length - 1; i++) 
	        {
	            for (int j = arr[i] + 1; j < arr[i + 1]; j++) 
	            {
	                System.out.print(j + " ");
	                
	            }
	        }
		
		
		
		
	}

}
