
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		
		for(int i =0;i<a;i++) {
		int c = sc.nextInt();
		arr.add(c);
		}
		
		for(int ccc : arr) {
			if(ccc<b) {
				arr2.add(ccc);
			}
		}
		for(int arrs : arr2) {
			System.out.print(arrs+" ");
		}
		
		
	}
}


