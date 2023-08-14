
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int result = 0;
		for(int i=0;i<a;i++) {
		int b = sc.nextInt();
		arr.add(b);
		}
		int c = sc.nextInt();
	
		
		for(int j=0;j<arr.size();j++) {
			if(arr.get(j) == c) {
				result++;
			}
		}
		System.out.println(result);
		sc.close();
		
	}
}


