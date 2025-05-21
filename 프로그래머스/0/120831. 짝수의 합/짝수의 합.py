def solution(n):
    a = 0
    if n % 2 == 0 :
        while 0 < n :
            a = a + n
            n -=2
    else :
        n -= 1
        while 0 < (n-1) :
            a = a + n
            n -= 2
    answer = a
    return answer