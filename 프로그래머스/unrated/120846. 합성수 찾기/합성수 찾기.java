class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            int result =0;
            for(int k=1; k<=i; k++){
                if(i%k == 0){
                    result++;
                }
            }
            if(result>2){
                answer++;
            }
        }
        
        return answer;
    }
}