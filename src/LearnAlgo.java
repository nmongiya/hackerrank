

public class LearnAlgo {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		for (int a = 1; a < 1000; a++) {
			for (int b = 1; b < 1000; b++) {
				for (int c = 1; c < 1000; c++) {
					for (int d = 1; d < 1000; d++) {
						
						if( Math.pow(a, 3) + Math.pow(b, 3) ==  Math.pow(c, 3) + Math.pow(d, 3))
						{
							if( a != b && b!=c && c!= d && a != c && a!=d )
							{
								System.out.println("a--> " + a + " b-->" + b + " c==>" + c + " d " + d);
							}
							
							break;
						}
					}
					
				}
				
			}
			
		}
		
    }

}
