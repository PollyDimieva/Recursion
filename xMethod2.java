package recursion;

public class xMethod2 {

public static void main(String[] args) {
   	 xRecursiveMethod(1234567);
   	 System.out.println();
   	 xIterativeMethod(1234567);
}

public static void xRecursiveMethod(int n) {
   	 if (n > 0) {
   		 System.out.print(n % 10);
   		 xRecursiveMethod(n / 10);
   	 }
 }

public static void xIterativeMethod(int n) {
	while (n%10!=0) {
		System.out.print(n%10);
		n=n/10;
		
	}
}






}
