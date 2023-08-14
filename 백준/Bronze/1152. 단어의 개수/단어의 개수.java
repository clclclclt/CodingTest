

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();

      
        String[] temp = a.split(" ");
        int result = temp.length;

        if(temp[0].equals("")){
            result --;
        }
        System.out.println(result);

    }

}
