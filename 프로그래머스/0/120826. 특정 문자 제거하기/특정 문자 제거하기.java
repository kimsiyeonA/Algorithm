class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        
        for(int i = 0; i < chars.length; i++){
            if(chars[i] != letter.charAt(0)){
                answer += chars[i];
            }
        }
        return answer;
    }
}