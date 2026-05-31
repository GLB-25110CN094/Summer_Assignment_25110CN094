//Q4----C PROGRAM TO FIND ARMSTRONG NUMBER IN RANGE


#include<stdio.h>
int main() {
    int start, end, temp, remainder, digits, sum, base, exponent, powerResult;
    printf("Enter lower limit of the range: ");
    scanf("%d", &start);
    printf("Enter upper limit of the range: ");
    scanf("%d", &end);

    printf("Armstrong numbers between %d and %d are:\n", start, end);
    for (int i = start; i <= end; i++) {
        temp = i;
        digits = 0;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        temp = i;
        sum = 0;
        while (temp != 0) {
            remainder = temp % 10;
            powerResult = 1;
            base = remainder;
            exponent = digits;
            while (exponent > 0) {
                powerResult *= base;
                exponent--;
            }
            
            sum += powerResult;
            temp /= 10;
        }
        if (sum == i) {
            printf("%d ", i);
        }
    }
    printf("\n");
    return 0;
}