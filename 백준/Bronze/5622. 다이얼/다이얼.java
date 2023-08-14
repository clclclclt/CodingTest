import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String a = sc.next();

int result = 2;


for(int i=0;i<a.length();i++){
    if(i != 0 && i != a.length()-1){
        result+= 1;
    }
int aaa = a.charAt(i) -65 + 65;
    if(aaa <= 67 && aaa >= 65){
        result+= 2;
    }else if(aaa <= 70 && aaa >= 68){
        result += 3;
    }else if(aaa <= 73 && aaa >= 71){
        result += 4;
    }else if(aaa <= 76  && aaa >= 74){
        result += 5;
    }else if(aaa <= 79 && aaa >= 77){
        result += 6;
    }else if(aaa <= 83 && aaa >= 80){
        result += 7;
    }else if(aaa <= 86 && aaa >= 84){
        result += 8;
    }else if(aaa <= 90 && aaa >= 87){
        result += 9;
    }
}

        System.out.println(result);
    }
}
