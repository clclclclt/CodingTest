import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


    while(sc.hasNext()){

        int a = sc.nextInt();
        int result = 0;
        List<Integer> arr = new ArrayList<>();

        for(int i=1;i<a;i++){
            if(a%i == 0){
                arr.add(i);
            }
        }
        Collections.sort(arr);
        for (Integer i : arr) {
            result+= i;
        }
        if(a == -1){
            break;
        }
        else if(a == result){
            System.out.print(a+" = ");
            for(int i=0; i<arr.size();i++){
            if(!(i == arr.size()-1)){
                System.out.print(arr.get(i)+" + ");
            }else{
                System.out.println(arr.get(i));
            }
            }

            }else{
            System.out.println(a+" is NOT perfect.");

        }
}









    }


}


