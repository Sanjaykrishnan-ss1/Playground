#include <stdio.h>

int main()
{ 
    // type your code here
  int a,b,c;
  char d,e;
  scanf("%d %c %d %c %d",&a,&d,&b,&e,&c);
  if(a>b&&a>c)
    printf("%d",a);
  else if(b>c)
    printf("%d",b);
  else
    printf("%d",c);
  return 0;
}