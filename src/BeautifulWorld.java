import java.lang.reflect.Array;
import java.util.Scanner;


public class BeautifulWorld {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
//        # Print 'Yes' if the word is beautiful or 'No' if it is not.
        char a[] = {'a','e','i','o','u','y'};
        
        String check = "aeiouy";
        boolean isBeautiful  = true;
        
        char firstC = w.charAt(0);
        for (int i = 1; i < w.length(); i++) {
        	
        	char SecondC = w.charAt(i);
        	
        	if(SecondC == firstC)
        	{
        		isBeautiful = false;
        		break;
        	}
			
        	if(check.indexOf(firstC) >= 0 )
        	{
        		if(check.indexOf(SecondC) >= 0)
        		{
        			isBeautiful = false;
        			break;
        		}
        	}
        	
        	firstC = SecondC;
        	
		}
        
        if(isBeautiful)
        {
        	System.out.println("Yes");
        }	
        else
        {
        	System.out.println("No");
        }
    }

}
