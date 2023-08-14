import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      
      ArrayList<String> aaa = new ArrayList<String>();
      int a = sc.nextInt();
      
      for(int i=0; i<a; i++) {
      String b = sc.next();
      String c = b.substring(0,1);
      String d = b.substring(b.length()-1);
      String f = c+d;
      aaa.add(f);
      }
      for(String fff : aaa) {
    	  System.out.println(fff);
      }
					
	}
}