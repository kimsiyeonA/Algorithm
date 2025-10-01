class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if (a !=  b && b != c && a!=c){
            answer = singleSum(a,b,c);
        }else if(a == b && b == c && a == c){
            answer = singleSum(a,b,c) * doubleSum(a,b,c) * tripleSum(a,b,c);
        }else{
            answer = singleSum(a,b,c) * doubleSum(a,b,c);
        }
        return answer;
    }
    
    public int singleSum(int a, int b, int c){
        return a+b+c;
    }
    
    public int doubleSum(int a, int b, int c){
        return (a*a)+(b*b)+(c*c);
    }
    
    public int tripleSum(int a, int b, int c){
        return (a*a*a)+(b*b*b)+(c*c*c);
    }
}