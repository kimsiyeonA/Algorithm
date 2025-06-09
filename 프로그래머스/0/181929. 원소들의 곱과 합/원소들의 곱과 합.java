class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mult = 1;
        
        for(int num : num_list){
            sum = sum + num;
            mult = mult * num; 
        }
        
        int answer = mult > sum*sum ? 0 : 1;
        return answer;
    }
}