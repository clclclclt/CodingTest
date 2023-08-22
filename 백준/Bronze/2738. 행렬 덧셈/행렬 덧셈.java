import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");


        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int arr1[][] = new int[a][b];
        int arr2[][] = new int[a][b];

        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int k=0;k<b;k++){
                arr1[i][k] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int k=0;k<b;k++){
                arr2[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        int arr3[][] = new int[a][b];
        for(int i=0;i<a;i++){
            for(int k=0;k<b;k++){
                arr3[i][k] = arr1[i][k] + arr2[i][k];
            }
        }

        for(int i=0;i<a;i++){
            for(int k=0;k<b;k++){
                System.out.print(arr3[i][k]+" ");
            }
            System.out.println();
        }




    }

}


