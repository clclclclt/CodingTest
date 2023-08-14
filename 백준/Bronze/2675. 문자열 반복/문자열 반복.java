

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int as = sc.nextInt();
        for(int aa=0;aa<as;aa++) {
            int a = sc.nextInt();
            String b = sc.nextLine();
            String result = "";
            for (int i = 0; i < b.length(); i++) {

                String c = b.substring(i, i + 1);

                for (int k = 0; k < a; k++) {

                    result += c;
                }

            }
            System.out.println(result.trim());
        }



    }

}
