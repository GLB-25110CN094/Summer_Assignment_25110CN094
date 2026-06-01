#include<stdio.h>
int main(){
    int num;
    printf("enter a number:");
    scanf("%d",&num);
    printf("factors of number are :\n");
    for(int i=1;i<=num;i++){
        if(num%i==0){
            printf(" %d \n",i);
        }
    }
    return 0;
}