import java.util.Scanner;


public class Subsequence {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String hack = "hackerrank";
            boolean check = true;
            
            int storeLastIndexofi = 0;
            int storeLastIndexofnexti = 0;
            int p;
            int l;
            
            
            for (int i = 0; i < hack.length()-1; i++) {
				
//            	storeLastIndexofi = s.indexOf(hack.charAt(i));
            	
            	
            	p = s.indexOf(hack.charAt(i),storeLastIndexofnexti);
            	l = s.indexOf(hack.charAt(i+1),p+1);
            	storeLastIndexofnexti = l;
            	check = checkGreater(p,l);
            	if(!check)
            	{
            		break;
            	}
            		
			}
            
            if(check)
            {
            	System.out.println("Yes");
            }else
            {
            	System.out.println("No");
            }
            
        }
    }
	
	public static boolean checkGreater(int p, int q)
	{
		boolean returnValue = true;
		
		if(p < q)
		{
			returnValue = true;
		}else
		{
			returnValue = false;
		}
		
		return returnValue;
	}

}
