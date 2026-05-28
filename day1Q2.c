//Q2-----C PROGRAM TO PRINT MULTIPLICATION TABLE OF A GIVEN NUMBER
#include<stdio.h>

int table(int num){
  for(int i=1;i<=10;i++){
    printf("%d x%d = %d\n",num,i,num*i);
  }
}
int main(){
  int num;
  printf("entet a number :");
  scanf("%d",&num);
  printf("table of  %d\n",num);
  table(num);
  return 0;

}