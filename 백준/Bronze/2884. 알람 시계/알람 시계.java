

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if((a>=0 && a<= 23) && (b>=0 && b<= 59)) {
		if(b>44) {
		System.out.print(a);
		System.out.print(" ");
		System.out.println(b-45);
		}else {
		if(a == 0) {
				a = 23;
				System.out.print(a);
				System.out.print(" ");
				System.out.println(b+15);
			}else {
				System.out.print(a-1);
				System.out.print(" ");
				System.out.println(b+15);
			}
		}
	}
		
		
	}

}
