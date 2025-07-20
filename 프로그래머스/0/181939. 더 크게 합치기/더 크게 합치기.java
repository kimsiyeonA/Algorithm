class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);

        String abString = aString+bString;
        String baString = bString+aString;
        
        int abInt = Integer.parseInt(abString);
        int baInt = Integer.parseInt(baString);

        if(baInt > abInt){
         answer = baInt;
        }else{
         answer = abInt;
        }
        return answer;
    }
}