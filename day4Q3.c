#include<stdio.h> 
int main(){
    int num,original_num,remainder,new_num=0;
    printf("enter 3 digite number : ");
    scanf("%d",&num);
    original_num=num;
    while(num!=0){
        remainder=num%10;
        new_num+=remainder*remainder*remainder;
     
     num=num/10;
    }
    if(new_num==original_num){
    printf("Given number is armstrong number ");
    } 
    else
    printf("it is not armstrong number");
    return 0;
}