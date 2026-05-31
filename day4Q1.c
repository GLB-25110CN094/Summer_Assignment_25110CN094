#include<stdio.h>
int fibonnaci(int num){
        if(num==0||num==1){
            return num;
        }
        else{
            return fibonnaci(num-1)+fibonnaci(num-2) ;
        }
    }

int main(){
    int num,series;
    printf("enter the number whose fibonnaci series to determine :");
    scanf("%d",&num);
    printf("\nfibonnaci series is:\n");
    for (int j=0;j<num;j++){
    printf("%d",fibonnaci(j));
    }
    return 0;
}