import java.util.Scanner;


public class ArraySOrt {
	
	boolean sorted = true;
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        
        for(int a0 = 0; a0 < q; a0++){
        	
        	
            int n = in.nextInt();
            int[] a = new int[n];
            
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
          
            //we need to do operation here
            //first check if array is already sorted
            
            boolean sorted = true;
            int temp = 0;
            
            for (int i = 0; i < a.length -1; i++) {
				if(a[i] > a[i+1] )
				{
					if( (a[i] - a[i+1]) == 1 )
					{
												
						a[i+1] = a[i+1] +1;
						a[i] = a[i] -1;
						
					}
					else
					{
						
					}
					
				}
			}
            
            
            //check if array is sorted
	        for (int i = 0; i < a.length-1; i++) {
				if(a[i] > a[i+1])
				{
					sorted = false;
					break;
				}
			}
            
            if(sorted)
            {
            	//array is already sorted, no need to do anything
            	System.out.println("Yes");
            }else
            {
            	System.out.println("No");
            }
            
            
        }
    }
	
	

	

}
