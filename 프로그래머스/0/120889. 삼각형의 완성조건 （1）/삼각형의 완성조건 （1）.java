class Solution {
    public int solution(int[] sides) {
        
        for(int i = 0; i < sides.length; i++){
            for(int j = 0; j < sides.length; j++){
                if(sides[i]>sides[j]){
                    int temp = sides[i];
                    sides[i] = sides[j];
                    sides[j] = temp;
                }
            }
        }
        
        int answer = 0;
        int sum = sides[1]+sides[2];
        
        if(sides[0]<sum){
            answer = 1;
        }else{
            answer = 2;
        }
        
        return answer;
    }
}