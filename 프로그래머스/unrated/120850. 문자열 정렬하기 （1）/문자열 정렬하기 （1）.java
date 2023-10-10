import java.util.*;
class Solution {
    public int[] solution(String my_string) {
       
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i)-'0' <10){
                arr.add(my_string.charAt(i)-'0');
            }
        }
    int answer[] = arr.stream().mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}