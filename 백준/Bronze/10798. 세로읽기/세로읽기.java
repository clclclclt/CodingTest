import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {





        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


      String arr[][] = new String[5][15];

      for(int i=0;i<5;i++){

          String temp[] = br.readLine().split("");
          for(int k=0;k<temp.length;k++){
              arr[i][k] = temp[k];
          }

      }
String result ="";
      for(int k=0;k<15;k++){
      for(int i=0;i<5;i++) {
          if (arr[i][k] != null) {
              result += arr[i][k];
          } else {
              continue;
          }
      }
      }

        System.out.println(result);













    }

}


