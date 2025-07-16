import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        for(int i = 0; i < chars.length; i++){
           if(chars[i]<97){
               chars[i] = Character.toLowerCase(chars[i]);
           }else{
               chars[i] = chars[i];
           }
        }
        
        Arrays.sort(chars);
        
        for(int i = 0; i < chars.length; i++){
            answer += chars[i];
        }
        return answer;
    }
}