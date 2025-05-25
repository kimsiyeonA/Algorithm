import java.util.Arrays;

class Solution {
    public int solution(String message) {
        int answer = 0;
        char[] arr = new char[message.length()];
        for(int i=0;i<message.length();i++){
            arr[i] = message.charAt(i);
        }
        
        answer=arr.length*2;
        return answer;
    }
}