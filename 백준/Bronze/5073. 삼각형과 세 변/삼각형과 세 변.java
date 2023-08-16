import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()) {
            for (int i = 0; i < 3; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int arr[] = new int[3];
                arr[0] = a;
                arr[1] = b;
                arr[2] = c;
                int result = 0;
                int idx = 0;
                for (int aa = 0; aa < arr.length; aa++) {
                    idx += arr[aa];
                    if (arr[aa] > result) {
                        result = arr[aa];

                    }
                }


                idx = idx - result;
           
                if (a == 0 && b == 0 && c == 0) {
                    break;
                }


                if (a == b && a == c) {
                    System.out.println("Equilateral");
                } else if (result >= idx) {
                    System.out.println("Invalid");
                } else if (a != b && a != c && b != c) {
                    System.out.println("Scalene");
                } else  {
                    System.out.println("Isosceles");
                }
            }

        }


    }


}


