//Q3----C PROGRAM TO CALCULATE FACTORIAL
#include<stdio.h>
int main(){
  int n,fact=1;
  printf("enter the number whose factorial to be calculated- ");
  scanf("%d",&n);
  for (int i = 1; i <= n; i++)
  {
    fact=fact*i;
  }
  printf("factorial of %d is %d",n,fact);
  return 0;
}