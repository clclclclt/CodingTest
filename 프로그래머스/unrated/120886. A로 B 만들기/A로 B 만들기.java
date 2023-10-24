import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int a = 0;
        int b = 0;
        
        for(int i=0; i<before.length();i++){
            a+= before.charAt(i)-'0';
            
        }
        
        for(int i=0; i<after.length();i++){
            b+= after.charAt(i)-'0';
            
        }
        
        
        return a==b ? 1 : 0;
    }
}