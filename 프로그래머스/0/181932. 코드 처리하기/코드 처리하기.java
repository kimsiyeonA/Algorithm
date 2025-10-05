class Solution {
    public String solution(String code) {
        String answer = "";
        char[] chars = code.toCharArray();
        int mode = 0;
        
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '1'){
                if(mode == 0){
                    mode++;
                }else{
                    mode--;
                }
                continue;
            }
            
            if(mode == 0 && i % 2 == 0){
                answer += chars[i];
            }else if(mode != 0 && i % 2 !=0){
                answer += chars[i];
            }
        }
        
        if(answer.equals("")){
            answer = "EMPTY";
        }
        return answer;
    }
}