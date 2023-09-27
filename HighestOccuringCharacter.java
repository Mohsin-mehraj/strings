import java.util.Scanner;

public class HighestOccuringCharacter {
	
	public static char Hoccur(String s1) {
		int arr [] = new int [256];
		
		for(int i = 0 ; i < s1.length() ;i++) {
			int ascii = (int)s1.charAt(i);
			arr[ascii]++;
		}
		int max = 0; 
		int maxchar = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxchar = i;
				
			}
		}
	
		return (char)maxchar;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(Hoccur(s1));
		sc.close();


	}

}
