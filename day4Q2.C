#include<stdio.h>
int main(){
    int first,second,next,num;
    first=0;
    second=1;
    printf("enter the number whose nth term to be find: ");
    scanf("%d",&num);
    if(num<=0){
        printf("enter positive integer ");
    }
    
    if(num==1){
        printf("%d",first);
         }
    else if(num==2){
        printf("%d",second);
        }
    else{
        for(int i=3;i<=num;i++){

        
            next=first+second;
            first=second;
            second=next;
        
        }
      
    
    printf( " nth fibonacci term is : %d",next);
    return 0;
   }
}