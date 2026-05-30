//Q2----C PROGRAM TO  PRINT PRIME NUMBER BITWEEN TWO NUMBER.

#include<stdio.h>
int main(){
    int low,up,i,j,isprime;
    printf("enter low and upper bound:");
    scanf("%d %d",&low,&up);
    for(i=low;i<=up;i++){
        if(i<2)continue;
        isprime=1;
        for(j=2;j<=i/2;j++){
         if(i%j==0){
            isprime=0;
            break;
         }
        }
        if(isprime){
            printf("%d",i);

        }
    }
    return 0;
}