class Solution {
    public int solution(String number) {
        
        int num = 0;
        
        char[] chars = number.toCharArray();
        
        for(int i = 0; i < chars.length; i++){
            num += Character.getNumericValue(chars[i]);
        }
        int answer = num%9;
        return answer;
    }
}