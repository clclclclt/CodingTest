import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int[] num= new int[2];
    num[0] = Integer.parseInt(st.nextToken());
    num[1] = Integer.parseInt(st.nextToken());

        List<Integer> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<num[0];i++){
        arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr,Collections.reverseOrder());

        System.out.println(arr.get(num[1]-1));


    }
}


