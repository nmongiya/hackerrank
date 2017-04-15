import java.util.Scanner;

public class CollideCircle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] r = new int[n];
        for(int r_i=0; r_i < n; r_i++){
            r[r_i] = in.nextInt();
        }
        // Write Your Code Here
        
        double area = 0;
        double[] areaArr = new double[n-k+1];
        int pointer = 0;
        
        int[] modifiedr= new int[n];
        
        
        int sum = 0;
        
        
        if(k == n-1)
        {
        	for (int i = 0; i < r.length; i++) {
				sum = sum + r[i];
			}
        	
        	area = Math.PI * Math.pow(sum, 2);
        }else
        {
        	double dummyArea =0 ;	
        	for (int i = 0; i < k; i++) {
        		
        		
        		for (int kl = 0; kl < n-i; kl++) {	
        			modifiedr = new int[r.length - i - 1];
        			
        			
        			modifiedr[kl] = r[kl] + r[kl+1];
            		for (int j = 0; j < modifiedr.length; j++) {
            			if(j != kl)
            			{
            				modifiedr[j] =r[pointer] + r[j+1] ; 
            			}
            			
    				}
            		for (int m = 0; m < modifiedr.length; m++) {
                		dummyArea = dummyArea + ( Math.PI * Math.pow(modifiedr[m], 2) );
        				
        			}
            		
            		areaArr[kl] = dummyArea;
            		
            		pointer++;
        			
				}
        		
        		
				
			}
        	
        	double dummysum = 0;
        	
        	for (int i = 0; i < areaArr.length; i++) {
        		dummysum = dummysum + areaArr[i];
    		}
        	area = dummysum / areaArr.length;
        	
        }
        
        
        
        
        System.out.println(area);
    }
}
