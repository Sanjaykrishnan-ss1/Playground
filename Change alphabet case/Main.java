#include <stdio.h>
int main() {
	// Type your code here
  char c;
  scanf("%c",&c);
  if(c>='a'&&c<='z')
    c-=32;
  else if(c>='A'&&c<='Z')
    c+=32;
  printf("%c",c);
	return 0;
}