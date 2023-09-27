import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

	public static String remove(String s1) {
		String z = "";
		z=z+s1.charAt(0);
		for(int i = 1 ; i < s1.length()-1;i++) {
			if(s1.charAt(i)!= z.charAt(z.length()-1)) {
				z=z+s1.charAt(i);
			}
		}
		return z;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(remove(s1));
		sc.close();


	}

}
