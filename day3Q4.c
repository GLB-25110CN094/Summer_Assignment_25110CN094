

// Q4-----C PROGRAM TO CALCULATE LCM OF TWO NUMBER 
#include <stdio.h>
int main()
{
    int x , y , max;
    printf("enter two number :");
    scanf("%d %d",&x,&y);
    max = (x > y) ? x : y;
    while (1) {
        if (max % x == 0 && max % y == 0) {
            printf("The LCM of %d and %d is %d.", x, y,
                   max);
            break;
        }

        ++max;
    }

    return 0;
}