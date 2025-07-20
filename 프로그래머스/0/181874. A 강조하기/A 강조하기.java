class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] chars = myString.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i]=='a'|| chars[i]=='A'){
                answer += Character.toUpperCase(chars[i]);
            }else{
                answer += Character.toLowerCase(chars[i]);
            }
        }
        return answer;
    }
}