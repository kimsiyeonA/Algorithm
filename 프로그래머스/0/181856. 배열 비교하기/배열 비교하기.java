class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arrsum1=0;
        int arrsum2=0;
        if(arr1.length == arr2.length){
            for(int i=0;i<arr2.length;i++){
                arrsum1 = arrsum1+arr1[i];
                arrsum2 = arrsum2+arr2[i];
            }
            if(arrsum1 == arrsum2){
                answer = 0;
            }else if(arrsum1 > arrsum2){
                 answer = 1;
            }else{
               
                answer = -1;
            }
        }else if(arr1.length > arr2.length){
           answer = 1;
        }else{
            
             answer = -1;
        }
        
        return answer;
    }
}