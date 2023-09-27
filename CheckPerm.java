import java.util.Scanner;

public class CheckPerm {

public static boolean Perm(String s1, String s2) {
	
	if(s1.length()!= s2.length()) {
		return false;
	}
	
	int arr[] =  new int [256];
	for(int i = 0 ; i < arr.length ;i++) {
		arr[i] = 0;
	}
	
	for(int j = 0 ; j < s1.length();j++) {
		int ascii = (int)s1.charAt(j);
		arr[ascii]++; 
	}
	for(int k = 0 ; k < s2.length();k++) {
		int ascii2 = (int)s2.charAt(k);
		arr[ascii2]--; 
	}
	
	for(int l = 0 ; l < arr.length ;l++) {
		if(arr[l]!=0) {
			return false;
		}
	}
	return true;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		boolean ans = Perm(s1,s2);
		System.out.println(ans);
		sc.close();

	}

}
