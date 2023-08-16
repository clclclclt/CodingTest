import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



while(sc.hasNext()) {
  try{
      int a= sc.nextInt();
      int b= sc.nextInt();
      if (a / b < 1 && b % a == 0) {
          System.out.println("factor");
      } else if (a % b == 0) {
          System.out.println("multiple");
      } else if(a%b != 0 && b%a != 0){
          System.out.println("neither");
      }
  }catch (ArithmeticException e){
      break;
  }
}








    }


}


