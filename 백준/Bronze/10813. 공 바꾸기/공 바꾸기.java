import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		int arr[] = new int[a];
		for(int k=0;k<a;k++) {
			arr[k]= k+1;
		}
		
		
		for(int i=0;i<b;i++) {
			int aa = sc.nextInt();
			int bb = sc.nextInt();
			int change1 = arr[aa-1];
			int change2 = arr[bb-1];
			arr[aa-1] = change2;
			arr[bb-1] = change1;
			
		}
	
		for(int kk=0;kk<arr.length;kk++) {
			System.out.print(arr[kk]+" ");
		}
		
		
		
		
	}
}