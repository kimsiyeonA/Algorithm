def solution(price):
    if 100000 > price >= 0 :
        answer = price 
    elif 300000 > price >= 100000 :
        answer = price * (1-0.05)
    elif 500000 > price >= 300000 :
        answer = price * (1-0.1)
    elif price >= 500000 :
        answer = price * (1-0.2)
        
    return int(answer)

#flout (실수형)