
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      
     List<Integer> arr = new ArrayList<Integer>();
 
      String a = sc.nextLine();
      String b = sc.nextLine(); 
      for(int i=0;i<b.length();i++) {
    	
    	  arr.add(b.charAt(i)-'0');
      }
      int sum = 0;
      for (int i : arr)
    	  sum += i;
      System.out.println(sum);
     
	}
}
