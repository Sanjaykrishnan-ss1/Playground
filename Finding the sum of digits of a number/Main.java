#include <stdio.h>
int main() {
	//Type your code
  int n,s=0;
  scanf("%d",&n);
  while(n>0)
  { 
    s += (n%10);
    n/=10;
  } 
  printf("%d",s);
	return 0;
}