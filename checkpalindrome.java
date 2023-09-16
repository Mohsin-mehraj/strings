import java.util.Scanner;

public class checkpalindrome {

	public static boolean check(String s) {
		
		int i =0;
		int j = s.length()-1;
		
		while(i < j) {
			if(s.charAt(i)!= s.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
			
			
		}
		return true;
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 String sc = s.nextLine();
		 boolean check = check(sc);
		 System.out.println(check);
	}

}
