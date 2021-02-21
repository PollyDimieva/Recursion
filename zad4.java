package recursion;

public class zad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double array[]= {1,5,6,3,8};
		System.out.println("Average is " + Average(array,5));
	}
 public static double Average(double array[],int n) {
	 return sum( array, n, 0)/n;
 }
 public static double sum(double array[], int n, double result) {
	 if(n==0) {
		 return result;
	 }else {
		 return sum(array, n-1, result+array[n-1]);
	 }
 }
}
