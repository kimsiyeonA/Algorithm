class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(String.valueOf(chars[i]).equals(alp)){
                answer += Character.toUpperCase(chars[i]);
            }else{
                answer += chars[i];
            }
        }
        return answer;
    }
}