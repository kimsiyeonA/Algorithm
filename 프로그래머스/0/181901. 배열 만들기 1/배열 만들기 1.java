class Solution {
    public int[] solution(int n, int k) {
        int length = 0;
        int sum = 0;
        
        for(int i = 1; i <= n; i++){
            if(i%k == 0){
                sum += 1;
            }
        }
        
        int[] answer = new int [sum];
        
        for (int i = 1; i <= n; i++){
        	if(i%k == 0){
                answer[length] = i;
                length++;
              	if(length == n/k){
                    break;
                }
            }    
        }
        return answer;
    }
}