import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<String> arr = new ArrayList<String>();
        String my_string2 = my_string.toLowerCase();
        for(int i=0; i<my_string2.length();i++){
            arr.add(String.valueOf(my_string2.charAt(i)));
        }
        Collections.sort(arr);
        for(String strs : arr){
            answer+= strs;
        }
        
        
        return answer;
    }
}