
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

	Scanner sc = new Scanner(System.in);
	

	Boolean bl = false;
			List<Integer> arr = new ArrayList<>();
		while(!bl) {
			 int a = sc.nextInt();
			 int b= sc.nextInt();
			 if(a == 0 && b == 0) {
				 bl = true;
			 }else {
		
				 arr.add(a+b);
			 }
		}
		for(int aaa : arr) {
			System.out.println(aaa);
		}
		
		}
}


