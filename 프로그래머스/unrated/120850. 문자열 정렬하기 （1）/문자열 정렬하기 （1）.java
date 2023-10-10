import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i)-'0' <10){
                arr.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }
        answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}