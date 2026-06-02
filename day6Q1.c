#include<stdio.h>
int main(){
    int num,r,binary=0,digit=1;
    printf("Enter a number :");
    scanf("%d",&num);
    while(num!=0){
        r=num%2;
        binary+=r*digit;
        num/=2;
        digit*=10;
         
    }
    printf("binary: %d \n",binary);
    return 0;
}