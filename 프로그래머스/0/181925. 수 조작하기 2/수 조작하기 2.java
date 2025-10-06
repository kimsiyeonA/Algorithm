class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 0; i < numLog.length-1; i++){
            int pointer = numLog[i+1]-numLog[i];
            if(pointer == 1){
                answer += "w";
            }else if(pointer == -1){
                answer += "s";
            }else if(pointer == 10){
                answer += "d";
            }else if(pointer == -10){
                answer += "a";
            }
        }
        return answer;
    }
}