
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int high = 0;
		int index = 0;
	for(int i=0;i<9;i++) {
		arr[i] = sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>high) {
			high = arr[i];
			index = i;
		}
	}
	System.out.println(high);
	System.out.println(index+1);
	
	}
}


