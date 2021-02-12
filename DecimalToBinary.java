package recursion;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("n=?");
		 int n=sc.nextInt();
		 System.out.println(dec2Bin(n));
	}
public static String dec2Bin(int n) {
	if(n==1) { 
		return "1";                         //4|0
                                            //2|0
	}else {                                 //1|1
		return dec2Bin(n/2) + n%2;                //base case "1" + 1->0 + 2->0
	}
}
}
