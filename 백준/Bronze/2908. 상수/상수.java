import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String result1 = "";
        String result2 = "";

        for(int i =a.length()-1;  i>=0; i--){
        result1 += a.charAt(i);

        }

        for(int i =b.length()-1;  i>=0; i--){
            result2 += b.charAt(i);
        }
        if(Integer.parseInt(result1) > Integer.parseInt(result2)){
            System.out.println(result1);
        }else{
            System.out.println(result2);
        }
    }
}
