#include <stdio.h>
int main()
{
  	//Your code here   
  int b,e;
  int p = 1;
  scanf("%d %d",&b,&e);
  if(e<0)
  {
    printf("Wrong input");
    return 0;
  }
  for(int i=0;i<e;i++)
  { 
    p = p * b;
  } 
  printf("%d",p);
    return 0;
}