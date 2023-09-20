package studio3;

import java.util.Scanner;

public class Studio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner in = new Scanner(System.in);	
		System.out.println("Type Number You Would Like to Test up to: ");
		int n = in.nextInt();
		int [] numbers = new int [n];
		boolean [] array = new boolean [n];
		for (int i = 0; i < n; i++) {
			array [i] = true;
			numbers [i] = i;
		}
		for (int i = 2; i < n; i++) {
			for (int m = i+i; m < n; m += i) {
			array [m] = false;
		}
				

	}
for (int i = 2; i<n; i++) {
	if (array[i] == true ) {
	System.out.println(numbers [i]);
}
}
}
}
