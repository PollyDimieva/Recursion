package recursion;

public class StepenNaDvoikata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.print(xRecursiveMethod(6));
   System.out.println();
   System.out.print(xIterativeMethod(6));
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
