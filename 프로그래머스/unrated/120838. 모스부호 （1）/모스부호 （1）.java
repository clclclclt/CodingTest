import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
       String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."};
        String[] tmp = letter.split(" ");

        for(int i=0; i<tmp.length;i++){
            for(int k=0; k<morse.length; k++){
                if(tmp[i].equals(morse[k])){
                    answer+= (char) (k+'a');
                    break;
                }
            }
        }
        
        return answer;
    }
}