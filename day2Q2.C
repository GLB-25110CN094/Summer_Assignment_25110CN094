//Q2------c program to calculate reverse of a number

#include<stdio.h>
int main(){
    int num,remainder,rev=0;
    printf("enter a number whose reverse to find: ");
    scanf("%d",&num);
    while(num!=0){
        remainder=num%10;
        rev=10*rev+remainder;
        num/=10;
        }
    printf("reverse of a input number is : %d",rev);
    return 0;
}