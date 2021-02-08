package recursion;

import java.util.Scanner;

public class StepenNaDvoikata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("n=?");
		 int n=sc.nextInt();
   System.out.print(xRecursiveMethod(n));
   System.out.println();
   System.out.print(xIterativeMethod(n));
	}
	public static int xRecursiveMethod(int n) {
		int result=2;
	   	 if (n==1) {
	   	result = 2;
	   	 }else {
	   		 result = result*xRecursiveMethod(n-1);
	   	 }
	   	 return result;
	 }

	public static int xIterativeMethod(int n) {
		return (int)Math.pow(2, n);
	}
}
