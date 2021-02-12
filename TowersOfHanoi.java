package recursion;

import java.util.Scanner;

public class TowersOfHanoi {
    static int num=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("n=?");
		 int n=sc.nextInt();
		 System.out.println("The moves are: ");
				 moveDisks(n,'A','C','B');
				 
	    System.out.println("Minimal moves: " +num);
	}
public static void moveDisks(int n, char fromTower,char toTower, char helpTower) {
	
	if(n==1) {
		moveDisk(n,fromTower,toTower);
	}else {
		moveDisks(n-1,fromTower,helpTower,toTower);
		moveDisk(n,fromTower,toTower);
		moveDisks(n-1,helpTower,toTower, fromTower);
	}
}public static void moveDisk(int n, char fromTower,char toTower) {
	

	System.out.println("Move disk " + n + " from tower " + fromTower + " to tower " + toTower);
	num++;





}




}
