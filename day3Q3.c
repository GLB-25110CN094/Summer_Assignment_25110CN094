#include<stdio.h>
int main(){
    int num1,num2,r;
    printf(" enter number 1 and number 2 :");
    scanf("%d %d",&num1,&num2);
    while(num2>0){
      r=num1%num2;
      num1=num2;
      num2=r;
    }
    printf("gcd of two number is %d",num1);
    return 0;
}