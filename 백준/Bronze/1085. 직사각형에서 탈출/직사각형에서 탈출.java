import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                   String a = br.readLine();
                    String arr[] = a.split(" ");
      int c= 0;
      int d = 0;
        c= Integer.parseInt(arr[2])-Integer.parseInt(arr[0]);
        d= Integer.parseInt(arr[3])-Integer.parseInt(arr[1]);
        int arr2[] = new int[4];

        arr2[0] = Integer.parseInt(arr[0]);
        arr2[1] = Integer.parseInt(arr[1]);
        arr2[2] = c;
        arr2[3] = d;


        int result = 1000;

        for (int i : arr2) {
            if(i<result){
                result = i;
            }
        }

        System.out.println(result);


    }
}


