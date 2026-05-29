#include<stdio.h>
int main(){
    int num,r,rev=0;
    printf("enter the number : ");
    scanf("%d",&num);
    int num2;
    num2=num;
    while(num!=0){
        r=num%10;
        rev=rev*10+r;
        num/=10;
     }
    if(num2==rev){
        printf("given number is palindrome");
    }
    else{
        printf("given number is not palindrome");
    }
    return 0;
}