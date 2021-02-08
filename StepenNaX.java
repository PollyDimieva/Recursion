package recursion;

import java.util.Scanner;

public class StepenNaX {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("x=?");
		 int x=sc.nextInt();
		 System.out.println("n=?");
		 int n=sc.nextInt();
   System.out.print(xRecursiveMethod(x,n));
   System.out.println();
   System.out.print(xIterativeMethod(x,n));
	}
	public static int xRecursiveMethod(int x,int n) {
		int result=x;
	   	 if (n==1) {
	   	result = x;
	   	 }else {
	   		 result = result*xRecursiveMethod(x,n-1);
	   	 }
	   	 return result;
	 }

	public static int xIterativeMethod(int x,int n) {
		return (int)Math.pow(x, n);
	}
}
