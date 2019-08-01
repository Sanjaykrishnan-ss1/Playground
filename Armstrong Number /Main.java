#include <stdio.h>
int main() {
	//Type your code
  int n,num,p=0,s=0,prod=1,a;
  int t;
  scanf("%d",&n);
  num = n;
  while(n>0)
  { 
    p++;
    n/=10;
  } 
  n  = num;
  while(n>0)
  {
    t = n% 10;
    a = p;
    prod=1;
    while(a>0)
    { 
      prod *= t;
      a--;
    } 
    s+=prod;
    n/=10;
  }
    
  if(num == s)
    printf("Armstrong Number");
  else
     printf("Not an Armstrong Number");
	return 0;
}