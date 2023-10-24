class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
          String kkk =  String.valueOf(k);
       
        for (int ii = i; ii <= j; ii++) {
            String tmp = String.valueOf(ii);
            for(int kk=0; kk<tmp.length();kk++){
                if(String.valueOf(tmp.charAt(kk)).contains(kkk))
                    answer++;
            }

        }
        
        return answer;
    }
}