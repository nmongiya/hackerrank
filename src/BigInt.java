import java.math.BigInteger;
import java.util.Scanner;


public class BigInt {
	
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.nextLine();
		
		BigInteger t1 = new BigInteger(myString.split(" ")[0]);
		BigInteger t2 = new BigInteger(myString.split(" ")[1]);
		BigInteger t3 = BigInteger.ONE;
		int n = Integer.parseInt(myString.split(" ")[2]);
		//int i = 2;
		
		for (int j = 2; j <= n; j++) {
			
			t3 = t1.add(t2.multiply(t2));
			
			t1 = t2;
			t2 = t3;
		}
				
		System.out.println(t3);
		
		scanner.close();
		
    }

}
