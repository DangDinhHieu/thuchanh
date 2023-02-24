package Slide30.java;
import java.util.Scanner;
public class Slide30 {
	public static void main(String[] args) {
	int n;
	int sum = 0;
	System.out.println("nhap n = ");
	n = new Scanner(System.in).nextInt();
	while ( n > 0 ) {
		sum+= n%10;
		n/= 10;
		
	}
	System.out.println("tong cac chu so = " +sum);
	
	}

}
