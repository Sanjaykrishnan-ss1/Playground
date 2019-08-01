#include<stdio.h>
int main()
{
  //type your code here
  char c;
  scanf("%c",&c);
  switch(c)
  { 
    case 'a':
    case 'e':
    case 'i': 
    case 'o':
    case 'u':
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
      printf("Vowel");
      break;
    default: 
      printf("Consonant");
  } 
  return 0;
}