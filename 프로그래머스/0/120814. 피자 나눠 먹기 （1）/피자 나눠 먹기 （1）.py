def solution(n):
    if n % 7 == 0 :
        sum = n // 7 
    else :
        a = 0
        sum = 0
    
        while a < n :
            if n // 7 == a:
                sum = a+1
            a += 1
    
    answer = sum
    return answer
    
