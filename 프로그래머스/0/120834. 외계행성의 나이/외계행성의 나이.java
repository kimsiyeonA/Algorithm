class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = String.valueOf(age);
        char[] chars = str.toCharArray();
        
        for(int i =0; i < chars.length; i++){
            answer += "" + (char)('a' + (chars[i] - '0'));
        }
        
        return answer;
    }
}