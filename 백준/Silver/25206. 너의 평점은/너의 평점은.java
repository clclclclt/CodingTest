import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Double> arr = new ArrayList<>();
        Double all = 0.0;
        boolean bl = true;
        int aaa = 0;
        while(bl) {
            if (aaa == 20) {
                break;
            }
            String[] temp = sc.nextLine().split(" ");
            if (!temp[2].contains("P")){
                all+= Double.parseDouble(temp[1]);

                if(temp[2].contains("A+")) {
                    arr.add(Double.parseDouble(temp[1]) * 4.5f);
                }else if(temp[2].contains("A0")){
                    arr.add(Double.parseDouble(temp[1]) * 4.0f);
                }else if(temp[2].contains("B+")){
                    arr.add(Double.parseDouble(temp[1]) * 3.5f);
                }
                else if(temp[2].contains("B0")){
                    arr.add(Double.parseDouble(temp[1]) * 3.0f);
                }
                else if(temp[2].contains("C+")){
                    arr.add(Double.parseDouble(temp[1]) * 2.5f);
                }
                else if(temp[2].contains("C0")){
                    arr.add(Double.parseDouble(temp[1]) * 2.0f);
                }
                else if(temp[2].contains("D+")){
                    arr.add(Double.parseDouble(temp[1]) * 1.5f);
                }
                else if(temp[2].contains("D0")){
                    arr.add(Double.parseDouble(temp[1]));
                }

            }
            aaa++;
        }
        Double result = 0.0;
        for(int k=0;k<arr.size();k++){
            result+= arr.get(k);
        }


        if(result >0) {
            System.out.printf("%.6f",result / all);
        }else{
            System.out.printf("%.6f",result);
        }











    }


}


