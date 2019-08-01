#include<stdio.h>
int main()
{
	//type your code here
  int a=0,b=0,n,i;
  scanf("%d",&n);
  for(i=3;i<=n;i++)
  { 
    if(i%2==1)
      a+=2;
    else 
      b+=1;
  } 
  if(n==1||n==2)
    printf("0");
  else if(n%2==1)
    printf("%d",a);
  else
    printf("%d",b);
	
}