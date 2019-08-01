#include<stdio.h>
int main()
{
  //Type your code here
  int a=0,b=1,no,n,i;
  scanf("%d",&no);
  printf("%d %d ",a,b);
  for(i=2;i<no;i++)
  { 
    n = a + b;
    a = b;
    b = n;
    printf("%d ",n);
  } 
  
  return 0;
}