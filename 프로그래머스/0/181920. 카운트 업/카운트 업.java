import java.util.ArrayList;

class Solution {
    public ArrayList solution(int start_num, int end_num) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = start_num; i <= end_num; i++){
            answer.add(i);
        }
        
        return answer;
    }
}