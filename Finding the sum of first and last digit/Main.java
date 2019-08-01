#include <stdio.h>
int main() {
	//Type your code
  int n,l,f,s=0,d=0,num;
  int c=1;
  scanf("%d",&n);
  l = n%10;
  num = n/10;
  while(num>0)
  { 
    c*=10;
    num/=10;
  } 
  f=n/c;
  s=f+l;
  printf("%d",s);;
	return 0;
}