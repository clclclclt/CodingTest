

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b && b==c) {
			System.out.println(10000+a*1000);
		}else if(a==b ) {
			System.out.println(1000+a*100);
		}else if( a==c ) {
			System.out.println(1000+a*100);
		}else if( b==c) {
			System.out.println(1000+b*100);
		}
		else {
			int e = 0;
			int[] arr2 = {a,b,c};
			for(int k =0;k<3;k++) {
				if(arr2[k]>e) {
					e= arr2[k];
				}
			}
			System.out.println(e*100);
		}
		
		
		
		
		
		
	}
}


