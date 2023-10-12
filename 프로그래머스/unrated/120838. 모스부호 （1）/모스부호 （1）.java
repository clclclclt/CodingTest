class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] temp = letter.split(" ");        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] word = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        for(int i=0; i< temp.length; i++){
            for(int k=0; k<morse.length;k++){
                if(morse[k].equals(temp[i])){
                    answer+= word[k];
                }
            }
        }
        
        return answer;
    }
}