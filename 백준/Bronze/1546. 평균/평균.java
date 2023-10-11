import java.util.*;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i< a ; i++){
            arr.add(sc.nextInt());
        }

        int result = Collections.max(arr);
        double sum = 0;
        for(int aa : arr){
            sum+= (double) aa/result*100;
        }


        System.out.println(sum/arr.size());
    }

}
