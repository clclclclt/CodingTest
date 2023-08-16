import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for(int i=1;i<a+1;i++){
                if(a%i == 0){
            arr.add(i);
                }
            }
        Collections.sort(arr);

       

            if(arr.size() >= b) {
                System.out.println(arr.get(b-1));
            }else{
                System.out.println(0);
            }








    }


}


