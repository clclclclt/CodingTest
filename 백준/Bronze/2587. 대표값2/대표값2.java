import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = new ArrayList<>();
        int result1 = 0;
        for(int i=0;i<5;i++){
            arr.add(Integer.parseInt(br.readLine()));
        }



        for (Integer i : arr) {
            result1+= i;
        }


        int bbb =  result1/ arr.size();
        int aaa = (arr.size() /2);

    Collections.sort(arr);
        System.out.println(bbb);
        System.out.println(arr.get(aaa));

    }
}


