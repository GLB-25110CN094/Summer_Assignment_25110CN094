#include<stdio.h>
int main(){
    int num,isprime;
    printf("enter a number : ");
    scanf("%d",&num);
    if(num<=0){
        isprime=0;
    }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isprime=0;
            }
            else{
                isprime=1;
            }
          
        }
if(isprime==0){
    printf("the given number is not prime");
}
else{


printf("the given number is prime");
}

}