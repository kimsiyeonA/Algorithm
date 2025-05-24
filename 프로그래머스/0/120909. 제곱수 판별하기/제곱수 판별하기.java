class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean found = false;
        for(int i = 0; i<=1000; i++){
            if(i*i == n){
               answer = 1;
                found = true;
            }
            
        }
        if(!found){
              answer = 2;
            }
        return answer;
    }
}