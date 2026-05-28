//Q4----c program to calculate number of digits 
#include<stdio.h>
int main(){
  int n,r,count=0;
  printf("enter a number whose no of digit to be counted- ");
  scanf("%d",&n);
  if(n==0){
    count=1;
  }
  
  while(n!=0){
    n=n/10;
    count=count+1;
  }
  
  printf("%d",count);
  return 0;
}
