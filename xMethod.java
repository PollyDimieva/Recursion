package recursion;

public class xMethod {
	public static void main(String[] args) {
	   	 System.out.println("Sum is " + xRecursiveMethod(5));
	   	 System.out.println("Sum is " + xIterativeMethod(4));
	}

	public static int xRecursiveMethod(int n) {
	   	 if (n == 1)
	   		 return 1;
	   	 else
	   		 return n + xRecursiveMethod(n - 1);
	}
	
	public static int xIterativeMethod(int n) {
		int sum=0;
		for(int j=1;j<=n;j++) {
			sum=sum+j;
		
		}
		return sum;
	}

}
