#include<stdio.h>
#include<math.h>

int main(){
    long long n;
    int decimal=0,i=0,r;
    printf("Enter a Binary number : ");
    scanf("%lld",&n);
    while(n!=0){
        r=n%10;
        decimal=decimal+r*pow(2,i);
        n/=10;
        ++i;
    }
    printf("decimal : %d \n ",decimal);
    return 0;
}