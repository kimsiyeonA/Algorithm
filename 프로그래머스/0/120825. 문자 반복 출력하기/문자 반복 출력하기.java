class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        for(int i = 0; i < chars.length; i++){
            for(int j = 1; j <= n; j++){
                answer += chars[i];
            }
        }
        return answer;
    }
}