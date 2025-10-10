import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = l; i <= r; i++){
            int num = i;
            int count = 0;
            char[] arr = String.valueOf(num).toCharArray();
            for(int j = 0; j < arr.length ; j++){
                if(arr[j]== '5' || arr[j] == '0'){
                    count++;
                }
            }
            if(count == arr.length){
                answer.add(i);
            }
        }
        if(answer.isEmpty()){
            answer.add(-1);
        }
        return answer;
    }
}