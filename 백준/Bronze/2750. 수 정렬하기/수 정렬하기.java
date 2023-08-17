import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<a;i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

 
    Collections.sort(arr);

        for (Integer i : arr) {
            System.out.println(i);
        }

    }
}


