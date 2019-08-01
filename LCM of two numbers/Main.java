#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,s,gcd,lcm,i;
  scanf("%d %d",&a,&b);
  if(a<b)
    s=a;
  else
    s=b;
  for(i=1;i<=s;i++)
  { 
    if((a%i==0)&&(b%i==0))
    { 
      gcd = i;
    } 
  } 
  lcm = (a*b)/gcd;
  printf("%d",lcm);
  return 0;
}