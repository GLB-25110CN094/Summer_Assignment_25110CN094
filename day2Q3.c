//Q3------c program to find product of digit of a number enter by user

#include<stdio.h>
int main(){
    int num,r,product=1;
    printf("enter the number whose product of digit to find : ");
    scanf("%d",&num);
    while(num!=0){
      r=num%10;
      product*=r;
      num/=10;
    }
    printf("the product of all digit of a number is : %d",product);
    return 0;
}

