#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int foodPrice= n * 12000;
    int drinkPrice = (k*2000) - ((n/10)*2000);
    int answer = foodPrice + drinkPrice;
    return answer;
}