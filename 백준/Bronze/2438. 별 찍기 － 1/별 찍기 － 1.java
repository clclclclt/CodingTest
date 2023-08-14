

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());


			StringTokenizer st;
	 String a = "";
			for (int i = 0; i < N; i++) {

			a = a+"*";
			System.out.println(a);
			}
	
			br.close();
	        
			bw.close();
			
			
		
		
		}
}


