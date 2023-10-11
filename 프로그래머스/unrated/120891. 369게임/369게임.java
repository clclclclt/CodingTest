class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(c-'0' == 3 || c-'0' == 
               6 || c-'0' ==9){
                answer++;
            }
                
        }
        
        return answer;
    }
}