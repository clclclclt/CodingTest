import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int arr[][] = new int[9][9];
    for(int i=0;i<9;i++){
        st = new StringTokenizer(br.readLine(), " ");
        for(int k=0;k<9;k++){
            arr[i][k] = Integer.parseInt(st.nextToken());
        }
    }

    int max = 0;

    for(int i=0;i<9;i++){
        for(int k=0;k<9;k++){
            if(arr[i][k] > max){
                max = arr[i][k];
            }
        }
    }

    int row = 0;
    int column = 0;
        for(int i=0;i<9;i++){
            for(int k=0;k<9;k++){
                if(arr[i][k] == max){
                    row = i;
                    column = k;
                }
            }
        }

        System.out.println(max);
        System.out.println((row+1)+" "+(column+1));

    }

}


