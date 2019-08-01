#include <stdio.h>
int main() {
	//Type your code
  int n,num,i,t,p,s=0;
  scanf("%d",&n);
  num = n;
  while(n>0)
  { 
    t = n%10;
    p=1;
    for(i=1;i<=t;i++)
    {
      p*=i;
    }
    s+=p;
    n/=10;
  } 
  if(num==s)
    printf("Yes");
  else
    printf("No");
	return 0;
}