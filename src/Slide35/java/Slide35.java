package Slide35.java;
import java.util.Scanner;
public class Slide35 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a và b = ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }


}
