class Solution {
    public String solution(String n_str) {
        String answer = "";
        int index = 0;
        char[] chars = n_str.toCharArray();
        
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '0'){
                index++;
            }else{
                break;
            }
        }
        
        
        for(int i = index; i < chars.length; i++){
            answer += chars[i];
        }
        return answer;
    }
}