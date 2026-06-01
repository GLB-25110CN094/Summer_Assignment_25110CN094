#include<stdio.h>
int main(){
    int num,r,sum=0,original_num;
    printf("enter a number : ");
    scanf("%d",&num);
    original_num=num;
  while(num!=0){
    r=num%10;
    int fact=1;
      for(int i=1;i<=r;i++){
          fact*=i;
      }
    sum+=fact;
    num/=10;
     }
     if(sum==original_num){
      printf("%d is a strong number",original_num);
    }
     else{
    printf("not a strong number");
    }
   return 0;
}