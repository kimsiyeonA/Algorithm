class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int muit = 1;
        if(11 <=num_list.length){
            for(int i=0;i<num_list.length;i++){
                sum = sum + num_list[i];
            }
            answer = sum;
        }else{
            for(int i=0;i<num_list.length;i++){
                muit = muit * num_list[i];
            }
            answer = muit;
        }
        
        
        return answer;
    }
}