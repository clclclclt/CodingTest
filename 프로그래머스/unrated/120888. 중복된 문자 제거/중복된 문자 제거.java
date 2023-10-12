import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<String> arr = new ArrayList<String>();

        for(int i=0;i<my_string.length();i++){
                    String str =  String.valueOf(my_string.charAt(i));
           if(!arr.contains(str)){
               arr.add(str);
           }
        }
        for(String s : arr){
            answer+= s;
        }
        return answer;
    }
}