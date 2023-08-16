import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


    while(sc.hasNext()) {

        int a = sc.nextInt();
        int result = 0;
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int aaa = 0;
            for (int k = 1; k < b + 1; k++) {
                if (b % k == 0) {
                    aaa++;
                }
            }
            if (aaa == 2) {
                result++;
            }
        }
        System.out.println(result);

    }






    }


}


