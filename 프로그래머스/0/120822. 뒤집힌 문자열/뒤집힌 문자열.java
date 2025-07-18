class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        for(int i = chars.length-1; i >= 0; i--){
            answer += chars[i];
        }
        return answer;
    }
}