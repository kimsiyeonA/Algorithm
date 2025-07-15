class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] chars = myString.toCharArray();
        char temp = ' ';
        for(int i = 0; i < chars.length; i++){
            if(chars[i] < 97){
                temp = Character.toLowerCase(chars[i]);
                answer += temp;
            }else{
                answer += chars[i];
            }
        }
        return answer;
    }
}