import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
       
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=num1; i<num2+1; i++){
            arr.add(numbers[i]);
        }
         int[] answer = new int[arr.size()];
        for(int a=0; a<answer.length;a++){
            answer[a] = arr.get(a);
        }
        return answer;
    }
}