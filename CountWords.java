import java.util.Scanner;

public class CountWords {

	
	public static int CountWords(String s) {
		int count = 0 ;
		for( int  i = 0; i < s.length() ;i++) {
			if(s.charAt(i) == ' ' )  {
				count ++;
			}
			
		}
		return count + 1;
		
	}
	
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String s1 = s.nextLine();
	int s2 = CountWords(s1);
	System.out.println(s2);
	s.close();
	}

}
