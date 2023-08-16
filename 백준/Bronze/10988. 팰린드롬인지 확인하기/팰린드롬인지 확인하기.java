import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    String test = sc.next();
 String a = "";
 String b = "";

 for(int i=0;i<=test.length()-1;i++){
     a += String.valueOf(test.charAt(i));
 }
        for(int i=test.length()-1;i>=0;i--){
            b += String.valueOf(test.charAt(i));
        }


        if(a.equals(b)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
    }

