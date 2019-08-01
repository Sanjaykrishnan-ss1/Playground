#include <stdio.h>
int main() {
	//Type your code
  int n,c=1,num;
  scanf("%d",&n);
  num = n/10;
  while(num>0)
  {
    c*=10;
    num/=10;
  } 
  c/=10;
  n = n/c;
  printf("%d",n%10);
	return 0;
}