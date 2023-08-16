import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    int M = sc.nextInt();
    int N = sc.nextInt();
    List<Integer> arr = new ArrayList<>();
    int result = 0;
    for(int i=M; i<N+1; i++) {

    int aaa=0;
        for (int k = 1; k < i+1; k++) {
            if (i % k == 0) {
                aaa++;
            }
        }
        if( aaa == 2){
            arr.add(i);
        }
            aaa=0;
          }
        for (Integer i : arr) {
            result+= i;
        }
    Collections.sort(arr);
        if(result==0){
            System.out.println(-1);
        }else{
            System.out.println(result);
            System.out.println(arr.get(0));
        }





    }


}


