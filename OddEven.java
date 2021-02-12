package recursion;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("n=?");
		 int n=sc.nextInt();
		System.out.println("The chosen number is even: "+EvenMethod(n));
		
		System.out.print("The chosen number is odd: "+OddMethod(n));
	}
	public static boolean EvenMethod(int n) {
		boolean isEven=true;
		if(n==0) {
			isEven = true;
		}else if(n==1) {
			isEven=false;
		} else {
			return EvenMethod(n-2);
		}
		
		return isEven;
		
	 }
	
	public static boolean OddMethod(int n) {
		boolean isOdd=true;
		if(n==0) {
			isOdd = false;
		}else if(n==1) {
			isOdd=true;
		} else {
			return OddMethod(n-2);
		}
		
		return isOdd;
		
	 }
	
	
}
