//Q1-----c program to calculate sum of digit enter by user

#include<stdio.h>
int main(){
    int num,r,sum=0;
    printf("enter the number whose sum of digite to find : ");
    scanf("%d",&num);
    while(num>0){
        r=num%10;
        sum+=r;
        num/=10;
    }
    printf("sum of digit of a number is : %d",sum);
    return 0;
}