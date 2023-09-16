import java.util.Scanner;

public class reverseeachword {

	
	public static String reverse (String s) {
		
		String ans = "";
		int startingword = 0;
		int i = 0 ;
		for(; i < s.length() ;i++) {
			if(s.charAt(i)==' ') {
				int endingword = i-1;
				String reverse = "";
				for(int j = startingword ; j <= endingword ;j++) {
					reverse = s.charAt(j) + reverse;
				}
				ans = ans + reverse + " ";
				startingword = i+1;
			}
		}
		int endingword = i-1;
		String reverse = "";
		for(int j = startingword ; j <= endingword ;j++) {
			reverse = s.charAt(j) + reverse;
		}
		ans = ans + reverse;
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(reverse(s1));
		sc.close();

	}

}
