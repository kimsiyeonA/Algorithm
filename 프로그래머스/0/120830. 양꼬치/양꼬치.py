def solution(n, k):
    a = n * 12000
    b = k * 2000
    c = int(n // 10) * 2000
    
    
    answer = a + b - c
    return answer