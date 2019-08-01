// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int a,b,s,i,ans;
  scanf("%d %d",&a,&b);
  if(a<b)
    s=a;
  else
    s=b;
  for(i=1;i<=s;i++)
  { 
    if((a%i==0)&&(b%i==0))
    { 
      ans=i;
    } 
  } 
  printf("%d",ans);
  
   return 0;
}