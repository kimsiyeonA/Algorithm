class Solution {
    public int solution(int[] numbers) {
        
        for(int i = 0; i<numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
               if(numbers[i] > numbers[j]){
                   int temp = numbers[i];
                   numbers[i] = numbers[j];
                   numbers[j] = temp;
               }
            }
        }
        
        int answer = numbers[0]*numbers[1];
        
        return answer;
    }
}