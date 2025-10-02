class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] chars = myString.toCharArray();
        for(int i = 0; i < chars.length ; i++){
            answer += Character.toUpperCase(chars[i]);
        }
        return answer;
    }
}