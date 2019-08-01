#include<stdio.h>
int main()
{
  int no,a,b;
  scanf("%d",&no);
  a = no/100;
  b = no%10;
  printf("%d",a+b);
  return 0;
}