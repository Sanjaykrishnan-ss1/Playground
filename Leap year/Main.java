#include<stdio.h>
int main()
{
  //Type your code here
  int yr;
  scanf("%d",&yr);
  if(yr%4==0)
  { 
    if(yr%100==0)
    { 
      if(yr%400==0)
      { 
        printf("Leap year");
      } 
      else
        printf("Not Leap year");
    } 
      else 
         printf("Leap year");
  } 
  else 
     printf("Not Leap year");
      
  return 0;
}