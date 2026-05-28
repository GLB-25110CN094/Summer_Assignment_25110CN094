//  Q1-----C program to CALCULATE SUM OF FIRST N NATURAL NUMBER
#include <stdio.h>

int main() {
    int num, sum = 0;
    printf("enter a integers: ");
    scanf("%d", &num);
    for(int i=0;i<=num;i++){
         sum+=i;
    }

    printf("Sum: %d", sum);

    return 0;
}


