import java.math.BigInteger;
import java.util.Scanner;


public class abbreviation {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
//		Sample Input

1
daBcd
ABC */
		Scanner scanner = new Scanner(System.in);
		int n  = scanner.nextInt();
		char ch;
		for (int i = 0; i < n; i++) {
			String originalString = scanner.next();
			String s1 = originalString.toLowerCase();
			String s2 = scanner.next().toLowerCase();
			
			if(s2.length() > s1.length())
			{
				System.out.println("NO");
				break;
			}
			
			if(s1.indexOf(s2)>= 0)
			{
				//System.out.println("YES");
				//we need to check if there is another upper case
				for (int j = 0; j < s1.indexOf(s2); j++) {
					
					ch = originalString.charAt(j);
					if(Character.isUpperCase(ch))
					{
						System.out.println("NO");
						break;
					}
				}
				for (int k = (s1.indexOf(s2) + s2.length()); k < s1.length(); k++) {
					
					ch = originalString.charAt(k);
					if(Character.isUpperCase(ch))
					{
						System.out.println("NO");
						break;
					}
					
					
				}
				System.out.println("YES");
			}else
			{
				System.out.println("NO");
			}
			
		}
		
		scanner.close();
		
    }
}
