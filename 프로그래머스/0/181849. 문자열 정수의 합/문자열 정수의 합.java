class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] chars = num_str.toCharArray();
        for(int i=0;i<chars.length ;i++){
            answer += Character.getNumericValue(chars[i]);
        }
        
        return answer;
    }
}