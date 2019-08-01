#include<stdio.h>
int main()
{
	//your code here
  int n;
  long int f=1,i;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    f = f * i;
  } 
  printf("%ld",f);
}