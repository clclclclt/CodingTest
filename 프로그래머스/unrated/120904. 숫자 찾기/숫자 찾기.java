class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = num+"";
        char kk = (char) (k+'0');
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == kk){
                answer= i+1;
                break;
            }
        }
        
        
        
        return answer == 0 ? -1 : answer;
    }
}