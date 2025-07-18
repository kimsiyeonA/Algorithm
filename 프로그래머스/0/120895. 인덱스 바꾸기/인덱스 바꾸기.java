class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        
        char temp = chars[num1];
        chars[num1] = chars[num2];
        chars[num2] = temp;
        
        for(int i = 0; i < chars.length; i++){
            answer += chars[i];
        }
        
        return answer;
    }
}