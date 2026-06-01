//Q4----C PROGRAM TO FIND LARGEST PRIME FACTOR OF A NUMBER


#include <stdio.h>
int main() {
    int n;
    int factor = 2;
    printf("Enter a number: ");
    scanf("%d", &n);
    if (n <= 1) {
        printf("No prime factors.\n");
        return 0;
    }
    while (n > 1) {
        if (n % factor == 0) {
            n = n / factor; 
        } else {
            factor++;       
        }
    }
    printf("Largest prime factor: %d\n", factor);
    return 0;
}