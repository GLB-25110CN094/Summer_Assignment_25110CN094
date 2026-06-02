#include<stdio.h>

int main(){
    int x; 
    int n;
    int exponent=1;
    printf(" Enter  base number : ");
    scanf("%d",&x);
    printf("Enter power : ");
    scanf("%d",&n );
    for(int i=1;i<=n;i++){
      exponent= exponent*x;
    }
    printf(" %d raised to power of %d is : %d \n",x,n,exponent);
}




