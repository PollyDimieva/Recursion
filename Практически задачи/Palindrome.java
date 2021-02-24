package recursion;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(isPalindrome("adada"));
		 System.out.println(isPalindrome("opoks"));
	}
	
	
	public static boolean isPalindrome(String a) {
		return isPalindrome(a,0,a.length()-1);
	}
	
	public static boolean isPalindrome(String a, int low, int high) {
	   	 if (low>=high) {
	   		 return true;
	   	 }else if(a.charAt(high)!=a.charAt(low)) {
	   		 return false;
	   	 }else 
	   	 
	   		 return isPalindrome(a,low + 1, high - 1);
	}
}
